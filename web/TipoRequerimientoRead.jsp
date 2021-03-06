<%@include file="header.jsp" %>

        <jsp:useBean id="negociotiporequerimiento" scope="request" class="Negocio.NegocioTipoRequerimiento" />
       <div class="row">
            <h1 class="form-signin-heading" align="center">Lista de Tipo de Requerimiento</h1>
        <div class="col-md-8">
        
        <table class="table table-striped">
        
            <thead>
                <th>Id</th>
                <th>Descripcion</th>
                <th></th>
                <th></th>
            </thead>
            <tbody>
                
            <c:forEach var="item" items="${negociotiporequerimiento.listaTipoRequerimiento}">
                <tr>
                    <td>${item.getIdTipoRequerimiento()}</td>
                    <td>${item.getDescripcion()}</td>
                    <td><input id="${item.getIdTipoRequerimiento()}" type="button" value="Editar" onclick="editarTipoRequerimiento(this.id)" class="btn btn-primary"></td>
                    <td><input id="${item.getIdTipoRequerimiento()}" type="button" value="Eliminar" onclick="eliminarTipoRequerimiento(this.id)" class="btn btn-primary"></td>
                </tr>
            </c:forEach>
                
            </tbody>
        </table>
            </div>
            </div>
        
    <script>
        function editarTipoRequerimiento(id){
            window.location.href="ServletTipoRequerimientoUpdate?id="+id;
        }
        function eliminarTipoRequerimiento(id){
            window.location.href="ServletTipoRequerimientoDelete?id="+id;
        }
    </script>
    <%@include file="footer.jsp" %>
