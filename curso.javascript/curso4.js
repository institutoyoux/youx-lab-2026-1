class Cursos{
    static curso=["Javascript","HTML","CSS","Arduino","Raspberry","C++","Python","Java","C#"]

    constructor(){}
     
    static getTodosCursos=()=>{
        return this.curso 
    }

     static getCursos=(i_curso)=>{
        return this.curso[i_curso]
    }

    static addCurso=(novoCurso)=>{
        this.curso.push(novoCurso)
    }

    static apagarCursos=()=>{
        this.cursos=[]
    }
}

export default Cursos