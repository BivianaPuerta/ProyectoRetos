var urlRest = 'https://g466d6ecb122158-pycomputadoras.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/computer/computer';

$(document).ready(function () {
    datosTabla();
});

function datosTabla() {
    $.ajax({
        url: urlRest,
        type: 'GET',
        datatype: 'JSON',

        success: function (respuesta) {
            var myItems = respuesta.items;
            var valor = '';

            for (i = 0; i < myItems.length;i++) {
                valor +=  '<tr>' +
                    '<td>' + myItems[i].id + '</td>' +
                    '<td>' + myItems[i].brand + '</td>' +
                    '<td>' + myItems[i].model + '</td>' +
                    '<td>' + myItems[i].category_id + '</td>' +
                    '<td>' + myItems[i].name + '</td>' +
                '</tr>'
                ;
            }
           
            $('#tbodyComputer').html(valor);

        }
    });
}

