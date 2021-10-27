
function datosBasicos(){
    $.ajax({
        url:"https://g466d6ecb122158-pycomputadoras.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/client/client",
        type:"GET",
        datatype:'JSON',
        contentType:"application/JSON",

        success: function(respuesta){
            console.log(respuesta);
            mostrarRespuesta(respuesta.items);
        },
        error:function (xhr,status){
            console.log(status)
        }
    });
}

function mostrarRespuesta(items){
    var myTable= `<table border="1">
            <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>EMAIL</th>
                <th>AGE</th>
                <th colspan="2">ACCIONES</th>
            </tr>`;
    
    
    for(i=0;i<items.length;i++){
        myTable+=`<tr>
                        <td>${items[i].id}</td>
                        <td>${items[i].name}</td>
                        <td>${items[i].email}</td>
                        <td>${items[i].age}</td>
                        <td><button onclick="eliminar"(${items[i].id})>Borrar</td>
                        <td><button onclick="editarInformacion"(${items[i].id})>Editar</td>
            </tr>
        `;
    }
    myTable+=`</table>`;
    $("#resultado").html(myTable);
}

function Agregar() {


    let datos={
        id:$("#id").val(),
        name:$("#name").val(),
        email:$("#email").val(),
        age:$("#age").val(),
    };
    
    $.ajax({
        type:"POST",
        url:"https://g466d6ecb122158-pycomputadoras.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/client/client",
        data: datos,
        datatype:'JSON',
        traditional: true,
        
        // contentType:"application.JSON",

        success: function(respuesta){

            
            $("#resultado").empty();
            $("#id").val("");
            $("#name").val("");
            $("#email").val("");
            $("#age").val("");
        datosBasicos(); 
        alert("Datos Agregados Correctamente")
        }
    });
}

$(document).ready(function () {
    editarInformacion();
    $("#btnGuardarEdicion").hide();
});

function editarInformacion(numId){
    $("#btnGuardarEdicion").show();
    $("#btnAgregar").hide();
    $("#btnConsultar").show();
    $("#numId").prop('disable',true);
    $("#name").focus();
    var datos={
        id:numId

    }
    
    $.ajax({
        url:"https://g466d6ecb122158-pycomputadoras.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/client/client/"+numId,
        data: datos,
        type:'GET',
        datatype:'JSON',
        

        sucess:function (respuesta){
            var items=respuesta.items;
            console.log(items);
            datosBasicos();
            $("#numid").val(items[0].id),
            $("#name").val(items[0].name),
            $("#email").val(items[0].email),
            $("#age").val(items[0].age)
        },
        error:function (xhr,status){
            console.log(status)
        }
    });

}

function actualizar(){
    var datos = {        
        id: $("#numid").val(),
        name: $("#name").val(),
        email: $("#email").val(),
        age: $("#age").val()
        }
    
    let datosPeticion=JSON.stringify(datos);

    $.ajax({
        url:"https://g466d6ecb122158-pycomputadoras.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/client/client",
        data: datosPeticion,
        type:'PUT',
        datatype:'JSON',
        contentType:"application/JSON",

        sucess:function (respuesta){
            console.log("Actualizado");
            datosBasicos();
        },
        error:function (xhr,status){
            console.log(status)
        }
    });
}

function eliminar(numId){
    var datos={
        id: numId
    }

    let datosPeticion=JSON.stringify(datos);

$.ajax({
    url:"https://g466d6ecb122158-pycomputadoras.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/client/client/"+numId,
    data: datosPeticion,
    type:'DELETE',
    datatype:'JSON',
    contentType:"application.JSON",

    sucess:function (respuesta){
        console.log("Elemento Borrado");
        datosBasicos();
    },
    error:function (xhr,status){
        console.log(status)
    }
});

}

