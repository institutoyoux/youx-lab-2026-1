class Post {
    constructor(post) {
        this.post = post;
    }
    getHtml() {
        const section = document.createElement("section");
        section.className = "post";

        section.innerHTML = `
        <a href="/user/?user=035.neto">
            <img src="${this.post.user.urlFoto}" class="foto">
            <div class="postContent">
                <span class="username">${this.post.user.username}</span>
                </a>
                <section>${this.post.conteudo}</section>
                <div class="like">
                    <i class="bx ${this.post.liked ? 'bxs-like' : 'bx-like'}"></i>
                    ${this.post.likes}
                </div>
            </div>
            ${this.post.owner ? `<div class="opts"><i class="bx bx-dots-vertical-rounded"></i><section class="opt" style="display: none;"><span class="excluir">excluir</span></section>` : ""}
        `;
        section.querySelector('.like').addEventListener("click", () => {
            this.post.liked ? this.dislike() : this.like()
        })
        section.querySelector(".bx-dots-vertical-rounded") && section.querySelector(".bx-dots-vertical-rounded").addEventListener("click", () => {
            options(section.querySelector(".bx-dots-vertical-rounded"))
        })
        section.querySelector(".excluir") && section.querySelector(".excluir").addEventListener("click", () => {
            alert("foi")
        })
        return section;
    }

    async dislike() {
        console.log(this.post);
        
        await authApi.delete(`post/${this.post.id}/dislike`)
        .then(async reponse => {
            await renderizarApi();
        })
        .catch(error => {
            alert("Não foi possível discurtir")
        })
    }

    async like() {
        await authApi.post(`post/${this.post.id}/like`)
        .then(async reponse => {
            await renderizarApi();
        })
        .catch(error => {
            alert("Não foi possível curtir")
        })
    }
}