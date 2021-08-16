$('document').ready(function() {

    $('table #edit-button').on('click', function(event) {
        
        event.preventDefault();
        
        var href = $(this).attr('href')

        $.get(href, function (country) {
            $('#id-edit').val(country.id);
            $('#capital-edit').val(country.capital);
            $('#code-edit').val(country.code);
            $('#continent-edit').val(country.continent);
            $('#nationality-edit').val(country.nationality);
            $('#description-edit').val(country.description);
        });

        $('#edit-modal').modal();
    });

    $('table #delete-button').on('click', function(event) {
        
        event.preventDefault();

        var href = $(this).attr('href');

        $('#confirm-button').attr('href', href);
        
        $('#delete-modal').modal();
    });
});