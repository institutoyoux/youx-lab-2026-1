import { useState } from "react";
import { useEffect } from "react";
import Tasks from "./components/Tasks";
import AddTasks from "./components/AddTask";
import { v4 } from "uuid";

function App() {
  const [tasks, setTasks] = useState(
    JSON.parse(localStorage.getItem("tasks")) || []
  );

  useEffect(() => {
    localStorage.setItem("tasks", JSON.stringify(tasks))
  },[tasks])

  useEffect(() => {
    const fetchTasks = async () => {
      // CHAMAR API
    const response = await fetch(
      "ttps://jsonplaceholder.typicode.com/posts?_limit=10",
      {
        method: "GET"
      }

  )
    // PEGAR DADOS QUE ELE RETORNA
    const data = await response.json()
    // ARMAZENAR/PERSISTIR ESSES DADOS NO STATE
    setTasks(data)
    }
    fetchTasks();
  }, [])

  function onTaskClick(taskId) {
    const newTasks = tasks.map(task => {
      //PRECISO ATUALIZAR ESSA TAREFA
      if(task.id === taskId) {
        return {...task, isCompleted: !task.isCompleted}
      }

      // NAO PRECISO ATUALIZAR ESSA TAREFA
      return task;
    })
    setTasks(newTasks)
  }

  function deleteTask(taskId){
    const newTasks = tasks.filter(task => task.id != taskId)
  setTasks(newTasks)}

  function addTask(title, description){
      const newTask = {
        id: v4(),
        title,
        description,
        isCompleted: false
      }
      setTasks([...tasks, newTask])
  }

  return (
    <div className="w-screen min-h-screen bg-slate-500 flex justify-center p-6">
      <div className="w-[400px] space-y-4">
        <h1 className="text-3xl text-slate-100 font-bold text-center">
          Gerenciador de Tarefas
          </h1>
        <AddTasks addTask={addTask}/>
        <Tasks tasks={tasks} 
        onTaskClick={onTaskClick} 
        deleteTask={deleteTask}/>
      </div>
    </div>
  );
}

export default App;