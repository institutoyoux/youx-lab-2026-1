const username = window.location.search.replace("?user=", '')
const todosDados = async () => {
    let user = false
    let posts = false
    await authApi.get(`/users/${username}`)
        .then(response => user = response.data)
        .catch(error => document.body.innerHTML = 'usuario não encontrado')
    await authApi.get(`/users/${username}/posts`)
        .then(response => posts = response.data)
        .catch(error => console.log(error))
    return {user: user, posts: posts}
}

const renderizarApi = async () => {
    const respApi = await todosDados();
    document.title = respApi.user.username + ' no Minitwitter'
    document.querySelector(".foto").src = respApi.user.urlFoto
    document.querySelector(".username").innerText = '@' + respApi.user.username
    document.querySelector(".contPost").innerHTML =  `${respApi.posts.length} <span>posts</span>`
    
    const post = respApi.posts
    document.querySelector(".posts").innerHTML = '';
    post.map((post) => {
        const newPost = new Post(post);
        
        document.querySelector(".posts").appendChild(newPost.getHtml())
    })
}
renderizarApi()