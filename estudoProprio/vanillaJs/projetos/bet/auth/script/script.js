const btn = document.querySelector(".submit");
const form = document.querySelector("form")


btn.addEventListener("click", (event) => {
    event.preventDefault()
    if (btn.getAttribute('act') === "login") {
        login()
    } else {
        signup()
    }
});


document.querySelectorAll("input").forEach(input => {
    input.addEventListener("input", () => {
        btn.disabled = !form.checkValidity()
    })
});


const login = async () => {

    normalReq.post('/auth/login', { email: form.email.value, password: form.password.value })
        .then(response => {
            localStorage.setItem("token", response.data.token)
            window.location.href = '/';
        })
        .catch(error => alert('Erro ao fazer login!'))
}

const signup = async () => {

    normalReq.post('/auth/register', { nome: form.name.value, confirmPass: form.confirm.value, email: form.email.value, password: form.password.value, data_nascimento: form.date.value})
        .then(response => {
            window.location.href = '/auth/login/';
        })
        .catch(error => alert('Erro ao fazer signup!'))
}

const eye = document.querySelector(".eye .bx")
eye.addEventListener("click", () => {
    if (form.password.type === 'password') {
        eye.className = 'bx bx-hide';
        form.password.type = 'text'
    } else {
        eye.className = 'bx bx-show';
        form.password.type = 'password'
    }
})