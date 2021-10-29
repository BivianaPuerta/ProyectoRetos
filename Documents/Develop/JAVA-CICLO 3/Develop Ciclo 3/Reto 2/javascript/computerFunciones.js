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
                    '<td>'+ '<button class="btn btn-info "onclick="detalle(' + myItems[i].id + ')"> Detalle </button>'+'</td>'+
                    '<td>'+ '<button class="btn btn-info "onclick="eiminarComputador(' + myItems[i].id + ')"> Eliminar </button>'+
                    '</td>' +
                '</tr>';
            }
           
            $('#tbodyComputer').html(valor);

        }
    });
}

function agregarComputador(){
    var datoscomputer={
        id:$("#numid").val(),
        brand:$("#brand").val(),
        model:$("#model").val(),
        category_id:$("#category_id").val(),
        name:$("#name").val(),
    };

$.ajax({
    type:"POST",
    url: urlRest,
    data: datoscomputer,
    datatype:'JSON',
    

    success: function(respuesta){
        datosTabla(); 
        alert("Datos Agregados Correctamente");
        },
        error:function (xhr,status){
            console.log(status);
        }
});

}
function eiminarComputador(idcomputador){
    var datoscomputador={
        id:idcomputador
    };
    let datosJson=JSON.stringify(datoscomputador);

    $.ajax({
        type:"DELETE",
        url: urlRest,
        datatype:'JSON',
        contentType:"application/JSON",

        success: function(respuesta){
            datosTabla(); 
            alert("Datos Eliminado");
            },
            error:function (xhr,status){
                console.log(status);
            }

    });

}