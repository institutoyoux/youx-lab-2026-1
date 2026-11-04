import { useState } from "react"

import Input from "../form/Input"
import SubmitButton from "../form/SubmitButton"

import styles from "../project/ProjectCard.module.css"

function ServiceForm({handleSubmit, btnText, projectData}){

    const [service, setService] = useState({})

    function submit(e){
        e.preventDefault()
        projectData.services.push(service)
        console.log(projectData.services)
        handleSubmit(projectData)
    }

    function handleChange(e){
        setService({...service, [e.target.name]: e.target.value})
    }

    return(     
        <form onSubmit={submit} className={styles.form}>
            <Input 
                type="text"
                text="Nome do serviço"
                name="name"
                placeholder="Insira o nome do serviço"   
                handleOnchange={handleChange}         
            />
              <Input 
                type="number"
                text="Custo de serviço"
                name="cost"
                placeholder="Insira o valor total"   
                handleOnchange={handleChange}         
            />
              <Input 
                type="text"
                text="Descrição do serviço"
                name="description"
                placeholder="Descreva o serviço"   
                handleOnchange={handleChange}         
            />
            <SubmitButton text={btnText}/>   
        </form>
    )
}

export default ServiceForm