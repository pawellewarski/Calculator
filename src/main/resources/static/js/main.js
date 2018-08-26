(function ($) {

    let calc_form = $("#calc_form");

    $('form').submit(function (e) {

        e.preventDefault();
        let first_number = calc_form.find("#first_number").val();
        let second_number = calc_form.find("#second_number").val();
        let options = calc_form.find("input[type='radio']:checked").val();

        let result_wrapper = $('.result_wrapper');

        let data = {
            first_number: first_number,
            second_number: second_number,
            options: options
        };
        $.ajax({
            type: 'POST',
            url: '/result',
            data: data,
        })
            .done(function (data) {
                result_wrapper.find('.result').text(data);
                result_wrapper.removeClass('hidden');
            });
    })
})(jQuery);