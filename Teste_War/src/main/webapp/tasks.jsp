<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.List, br.com.luhf.Task" %>
<html>
<head>
    <title>Gerenciador de Tarefas</title>
</head>
<body>
    <h1>Lista de Tarefas</h1>
    <form action="tasks" method="post">
        <input type="text" name="description" placeholder="Descrição da tarefa" required>
        <button type="submit">Adicionar Tarefa</button>
    </form>
    <ul>
        <%
            List<br.com.luhf.Task> tasks = (List<br.com.luhf.Task>) request.getAttribute("tasks");
            if (tasks != null && !tasks.isEmpty()) {
                for (br.com.luhf.Task task : tasks) {
        %>
                    <li><%= task.getDescription() %></li>
        <%
                }
            } else {
        %>
                <li>Não há tarefas cadastradas</li>
        <%
            }
        %>
    </ul>
</body>
</html>
