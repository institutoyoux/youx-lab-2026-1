const nomeTarefa = document.getElementById("nomeTarefa");
const dataTarefa = document.getElementById("dataTarefa");
const dataTerminoTarefa = document.getElementById("dataTerminoTarefa");
const statusTarefa = document.getElementById("statusTarefa");
const tiposTarefa = document.getElementById("tiposTarefa");

const btnCadastrarTarefa = document.getElementById("btnCadastrarTarefa");
const listaTarefas = document.getElementById("listaTarefas");

let linhaEditando = null;

btnCadastrarTarefa.addEventListener("click", function () {

    if (
        nomeTarefa.value.trim() === "" ||
        dataTarefa.value === "" ||
        dataTerminoTarefa.value === ""
    ) {
        alert("Preencha todos os campos!");
        return;
    }

    if (dataTerminoTarefa.value < dataTarefa.value) {
        alert(
            "A data de término não pode ser anterior à data de cadastro!"
        );
        return;
    }

    const tipoTexto =
        tiposTarefa.options[tiposTarefa.selectedIndex].text;

    const statusTexto =
        statusTarefa.options[statusTarefa.selectedIndex].text;

    const prazo =
        calcularPrazo(dataTerminoTarefa.value);

    if (linhaEditando !== null) {

        linhaEditando.innerHTML = criarLinha(
            nomeTarefa.value,
            tipoTexto,
            dataTerminoTarefa.value,
            statusTexto,
            statusTarefa.value,
            prazo
        );

        linhaEditando = null;

        btnCadastrarTarefa.textContent =
            "+ Cadastrar Tarefa";

        limparFormulario();

        return;
    }

    const novaLinha = document.createElement("tr");

    novaLinha.innerHTML = criarLinha(
        nomeTarefa.value,
        tipoTexto,
        dataTerminoTarefa.value,
        statusTexto,
        statusTarefa.value,
        prazo
    );

    listaTarefas.appendChild(novaLinha);

    limparFormulario();
});


function criarLinha(
    nome,
    tipo,
    dataTermino,
    statusTexto,
    statusValor,
    prazo
) {

    return `
        <td>
            ${nome}
        </td>

        <td>
            ${tipo}
        </td>

        <td>
            ${formatarData(dataTermino)}
        </td>

        <td>
            <span class="${classeStatus(statusValor)}">
                ${statusTexto}
            </span>
        </td>

        <td>
            <span class="${prazo.classe}">
                ${prazo.texto}
            </span>
        </td>

        <td>
            <button
                type="button"
                class="btnEditar"
            >
                Editar
            </button>

            <button
                type="button"
                class="btnExcluir"
            >
                Deletar
            </button>
        </td>
    `;
}


function calcularPrazo(dataFinal) {

    const hoje = new Date();

    hoje.setHours(0, 0, 0, 0);

    const termino =
        new Date(dataFinal + "T00:00:00");

    const diferenca =
        termino - hoje;

    const dias =
        Math.ceil(
            diferenca / (1000 * 60 * 60 * 24)
        );

    if (dias < 0) {

        return {
            texto: "ATRASADO",
            classe: "prazoAtrasado"
        };

    }

    if (dias === 0) {

        return {
            texto: "HOJE",
            classe: "prazoEmDia"
        };

    }

    return {
        texto:
            `${dias} dia${dias > 1 ? "s" : ""}`,
        classe: "prazoEmDia"
    };
}


function classeStatus(status) {

    if (status === "finalizado") {
        return "statusFinalizado";
    }

    if (status === "em-andamento") {
        return "statusEmAndamento";
    }

    return "statusNaoIniciado";
}


function formatarData(data) {

    const partes =
        data.split("-");

    return `
        ${partes[2]}/${partes[1]}/${partes[0]}
    `;
}


function limparFormulario() {

    nomeTarefa.value = "";

    dataTarefa.value = "";

    dataTerminoTarefa.value = "";

    statusTarefa.value = "nao-iniciado";

    tiposTarefa.value = "trabalho";
}


listaTarefas.addEventListener(
    "click",
    function (evento) {

        if (
            evento.target.classList.contains("btnExcluir")
        ) {

            const linha =
                evento.target.closest("tr");

            linha.remove();
        }

        if (
            evento.target.classList.contains("btnEditar")
        ) {

            const linha =
                evento.target.closest("tr");

            const colunas =
                linha.querySelectorAll("td");

            const nome =
                colunas[0].textContent.trim();

            const tipo =
                colunas[1].textContent.trim();

            const data =
                colunas[2].textContent.trim();

            const status =
                colunas[3].querySelector("span");

            nomeTarefa.value = nome;

            const partesData =
                data.split("/");

            dataTerminoTarefa.value =
                `${partesData[2]}-${partesData[1]}-${partesData[0]}`;

            dataTarefa.value =
                new Date()
                    .toISOString()
                    .split("T")[0];

            if (tipo === "Trabalho") {

                tiposTarefa.value = "trabalho";

            } else if (tipo === "Estudos") {

                tiposTarefa.value = "estudos";

            } else if (tipo === "Pessoal") {

                tiposTarefa.value = "pessoal";
            }

            if (
                status.classList.contains(
                    "statusFinalizado"
                )
            ) {

                statusTarefa.value =
                    "finalizado";

            } else if (
                status.classList.contains(
                    "statusEmAndamento"
                )
            ) {

                statusTarefa.value =
                    "em-andamento";

            } else {

                statusTarefa.value =
                    "nao-iniciado";
            }

            linhaEditando = linha;

            btnCadastrarTarefa.textContent =
                "Salvar Alterações";

            window.scrollTo({
                top: 0,
                behavior: "smooth"
            });
        }
    }
);