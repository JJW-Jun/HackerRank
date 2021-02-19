$.getJSON(`${c}/managers/list`)

$.getJSON(`${c}/managers/list`, function (d) {
    $.each(d, function (i, j) {
        $(
            '<tr>' + '<th>' + j.id + '</th>' + '<th>' + j.password
            + '</th>' + '</tr>').appendTo('#tbody').click(
            function (e) {
                location.href = `${c}/detail/detail/` + j.id;

            })
    })

})
