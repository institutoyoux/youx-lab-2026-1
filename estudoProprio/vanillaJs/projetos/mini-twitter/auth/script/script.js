const eye = document.getElementById("eye")
const inputSenha = document.getElementById("password")
const inputs = document.querySelectorAll("form input")
const buttonSubmit = document.getElementById("submit")
const form = document.getElementById("loginForm")

inputs.forEach(input => {
    input.addEventListener("input", () => {
        buttonSubmit.disabled = !form.checkValidity()
    })
})

eye.addEventListener('click', () => {
    if (inputSenha.type === "password") {
        inputSenha.type = "text";
        eye.className = "bx bx-hide";
    } else {
        inputSenha.type = "password";
        eye.className = "bx bx-show";
    }
})

const login = async () => {
    let body = {
        login: form.login.value,
        password: form.password.value
    }
    try {
        const res = await axios.post("http://localhost:8080/auth/login", body)
        localStorage.setItem("token", res.data.token)
        window.location.href = '/home/'
    } catch (error) {
        if (error.response.data) {
            let errorDiv = document.querySelector(".error")
            errorDiv.removeAttribute("disabled");
            errorDiv.innerHTML = `<i class='bx bx-info-circle'></i><span>${error.response.data.message}</span>`
        } else {
            alert("Ocorreu um erro ao fazer login!")
        }
    }
}

const signup = async () => {
    let body = {
        username: form.username.value,
        email: form.email.value,
        password: form.password.value
    }
    try {
        const res = await axios.post("http://localhost:8080/auth/register", body)
        window.location.href = '/auth/login/'
    } catch (error) {
        if (error.response.data) {
            let errorDiv = document.querySelector(".error")
            errorDiv.removeAttribute("disabled");
            errorDiv.innerHTML = `<i class='bx bx-info-circle'></i><span>${error.response.data.message}</span>`
        } else {
            alert("Ocorreu um erro ao fazer cadastro!")
        }
    }
}

buttonSubmit.addEventListener("click", async (event) => {
    event.preventDefault()
    if (buttonSubmit.getAttribute("act") === "login") {
        login()
    } else {
        signup();
    }
})
