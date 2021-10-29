function listarDatos(){
    $.ajax({
        url:"https://g466d6ecb122158-pycomputadoras.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/message/message",
        type:"GET",
        datatype:'JSON',
        contentType:"application/JSON",

        success: function(respuesta){
            colocarRespuesta(respuesta.items);
        },
        error:function (xhr,status){
            console.log(status)
        }
    });
}

function colocarRespuesta(items){

    $("#userstable").remove();
    var myTable= `<table id="userstable" border="1">
            <tr>
                <th>ID</th>
                <th>MESSAGE</th>
                <th colspan="2">ACCIONES</th>
            </tr>`;    
    
    for(i=0;i<items.length;i++){
        myTable+=`<tr>
                    <td>${items[i].id}</td>
                    <td>${items[i].messagetext}</td>
                    <td><button onclick="eliminarDatos(${items[i].id})">Borrar</td>
                    <td><button onclick="editarInformacion(${items[i].id})">Editar</td>
                 </tr>`;
    }
    myTable+=`</table>`;
    $("#resultado").append(myTable);
}

function Agregar() {

    console.log("Inicia Agregado");
    let datos3={
        id:$("#numid").val(),
        messagetext:$("#messagetext").val(),
    };
    
    console.log(datos3);

    $.ajax({
        type:"POST",
        url:"https://g466d6ecb122158-pycomputadoras.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/message/message",
        data: datos3,
        datatype:'JSON',
        traditional: true,
        
        // contentType:"application.JSON",

        success: function(respuesta){
        listarDatos(); 
        alert("Datos Agregados Correctamente");
        },
        error:function (xhr,status){
            console.log(status);
        }
    });
}

//$(document).ready(function () {
    //editarInformacion();
    //$("#btnGuardarEdicion").hide();
//});

function editarInformacion(numid) {

    $("#numid").prop("disabled", true);
    OcultarBotones(true);
    $.ajax({
        url: `https://g466d6ecb122158-pycomputadoras.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/message/message/${numid}`,
        type:"GET",
        datatype:'JSON',
        contentType:"application/JSON",

        success: function(respuesta){
            var items=respuesta.items;
            // $("#resultado").empty();
            $("#numid").val(items[0].id),
            $("#messagetext").val(items[0].name)
        },
        error:function (xhr,status){
            console.log(status)
        }
    });
}

function actualizar(){
    let datos3 = {        
        id: $("#numid").val(),
        messagetext: $("#messagetext").val()
        }
        console.log(datos3);
        let datosPeticion=JSON.stringify(datos3);

    $.ajax({
        url:"https://g466d6ecb122158-pycomputadoras.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/message/message",
        data: datosPeticion,
        type:'PUT',
        datatype:'JSON',
        contentType:"application/JSON",

        success:function (respuesta){
            $("resultado").empty();
            $("#numid").val("");
            $("#messagetext").val("");
            listarDatos();     
            $("#numid").prop('disabled',false);
            OcultarBotones(false);
            console.log("Actualizado");
        },
        error:function (xhr,status){
            console.log(status);
        }
    });
}

function eliminarDatos(idelement) {
    console.log("Borrar");
    var datos={
        id:idelement
    }
    let datosPeticion=JSON.stringify(datos);

    $.ajax({
        url: "https://g466d6ecb122158-pycomputadoras.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/message/message",
        data:datosPeticion,
        type:'DELETE',
        contentType:"application/JSON",

        success: function (respuesta) {
            listarDatos();
            alert("Elemento Borrado");
        },
        error: function (xhr, status) {
            console.log(status)
        }
    });
}

function Cancelar()
{
    OcultarBotones(false);
}

function OcultarBotones(hidenbtn)
{  
    if(hidenbtn)
    {
        $("#btnConsultar").hide();
        $("#btnAgregar").hide();
        $("#btnEditar").show();
        $("#btnCancelar").show();
        return;
    } 
    $("#btnEditar").hide();
    $("#btnCancelar").hide();
    $("#btnConsultar").show();
    $("#btnAgregar").show();
}