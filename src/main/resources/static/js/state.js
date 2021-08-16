$('document').ready(function() {

    $('table #edit-button').on('click', function(event) {
        
        event.preventDefault();
        
        var href = $(this).attr('href')

        $.get(href, function (state) {
            $('#id-edit').val(state.id);
            $('#name-edit').val(state.name);
            $('#capital-edit').val(state.capital);
            $('#code-edit').val(state.code);
            $('#country-edit').val(state.countryid);
            $('#details-edit').val(state.details);
        });

        $('#edit-modal').modal();
    });

    $('table #detail-button').on('click', function(event) {
        
        event.preventDefault();
        
        var href = $(this).attr('href')

        $.get(href, function (state) {
            $('#name-display').val(state.name);
            $('#capital-display').val(state.capital);
            $('#code-display').val(state.code);
            $('#country-display').val(state.countryid);
            $('#detail-display').val(state.details);
        });

        $('#detail-modal').modal();
    });

    $('table #delete-button').on('click', function(event) {
        
        event.preventDefault();

        var href = $(this).attr('href');

        $('#confirm-button').attr('href', href);
        
        $('#delete-modal').modal();
    });
});