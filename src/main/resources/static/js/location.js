$('document').ready(function() {

    $('table #edit-button').on('click', function(event) {
        
        event.preventDefault();
        
        var href = $(this).attr('href')

        $.get(href, function (location) {
            $('#id-edit').val(location.id);
            $('#city-edit').val(location.city);
            $('#address-edit').val(location.address);
            $('#country-edit').val(location.countryid);
            $('#state-edit').val(location.stateid);
            $('#details-edit').val(location.details);
            $('#description-edit').val(location.description);
        });

        $('#edit-modal').modal();
    });

    $('table #detail-button').on('click', function(event) {
        
        event.preventDefault();
        
        var href = $(this).attr('href')

        $.get(href, function (location) {
            $('#city-display').val(location.city);
            $('#address-display').val(location.address);
            $('#country-display').val(location.countryid);
            $('#state-display').val(location.stateid);
            $('#detail-display').val(location.details);
            $('#description-display').val(location.description);
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