const curso=["Javascript","HTML","CSS","Arduino","Raspberry","C++","Python","Java","C#"]

// const getTodosCursos=()=>{
//     return curso
// }

export default function getTodosCursos(){
    return curso
}

function getCurso(i_curso){
    return curso[i_curso]
}

// export default getTodosCursos
// export {curso,getCurso}
export {getCurso}
