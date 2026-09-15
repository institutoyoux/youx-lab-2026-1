import { useEffect, useState } from "react";
import AddTasks from "./components/AddTasks";
import Tasks from "./components/Tasks";
import {v4}  from "uuid";

function App() {
  const [tasks, setTasks] = useState([{
    id: 1,
    title: "Estudar Programação",
    description: "Estudar programação pra se tornar um desenvolvedor full stack. ",
    isCompleted: false,
  }, {
     id: 2,
    title: "Estudar Ingles",
    description: "Estudar ingles para se tornar fluente. ",
    isCompleted: false,
  }, {
     id: 3,
    title: "Estudar Matematica",
    description: "Estudar programação pra se tornar um desenvolvedor full stack. ",
    isCompleted: false,
  
  }])


  useEffect(( ) => {

  }, [task])



  function onTaskClick(taskId){
    const newTask= tasks.map(task => {
      // PRECISO ATUALIZAR ESSA TAREFA 
      if(task.id == taskId){
        return{...task, isCompleted: !task.isCompleted}
      }

      //NÃO PRECISO ATUALIZAR ESSA TAREFA
      return task 
    })
    setTasks(newTask)
  }

  function onDeleteTaskClick (taskId) {
    const newTask = tasks.filter(task => task.id !== taskId)
    setTasks(newTask)
  }

  function onAddTaskSubmit(title, description){
    const newTask= {
      id: v4(),
      title,
      description,
      isCompleted: false
    }
    setTasks([...tasks, newTask])

  }


  return (
    <div className="w-screen h-screen bg-slate-500 flex justify-center p-6">
      <div className="w-[500px] space-y-4">
        <h1 className="text-3xl text-slate-100 font-bold text-center">
          Gerenciador de Tarefas
          </h1>
        <AddTasks onAddTaskSubmit={onAddTaskSubmit} />
        <Tasks tasks={tasks} 
        onTaskClick={onTaskClick}
        onDeleteTaskClick={onDeleteTaskClick}
        />
      </div>
    </div>
  );
}

export default App;
 