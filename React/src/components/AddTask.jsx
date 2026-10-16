import { useState } from "react";
import Input from "./Input";

function AddTasks({ addTask }) {
  const [title, setTitle] = useState("");
  const [description, setDescription] = useState("");

  return (
    <div className="space-y-4 p-6 bg-slate-200 rounded-md shadow flex flex-col">
      
      <Input
        type="text"
        placeholder="Digite o título da tarefa"
        
        value={title}
        onChange={(event) => setTitle(event.target.value)}
      />
      <Input
        type="text"
        placeholder="Digite a descrição da tarefa"
        value={description}
        onChange={(event) => setDescription(event.target.value)}
      />
      <button
        onClick={() => {
          if (!title.trim() || !description.trim()) {
            return alert("Preencha os campos acima");
          }
          addTask(title, description);
          setTitle("");
          setDescription("");
        }}
        className="bg-slate-500 px-6 py-1 text-white rounded-md"
      >
        Adicionar
      </button>

    </div>
  );
}

export default AddTasks;