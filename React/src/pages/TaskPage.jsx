import { ChevronLeftIcon } from "lucide-react";
import { useNavigate, useSearchParams } from "react-router-dom"

function TaskPage() {
    const navigate = useNavigate()
    const [searchParams] = useSearchParams();
    const title = searchParams.get("title")
    const description = searchParams.get("description")
    function onBackClick() {
        navigate(-1)
    }

    return (
    <div className="h-screen w-screen bg-slate-500 p-6">
    
        <div className="w=[500px] space-y-4">
         <div className="flex justify-center relative mb-6 text-slate-50">
            
            <button onClick={onBackClick} className="absolute left-0 top-0 button-0">
                <ChevronLeftIcon/>
            </button>
            <h1 className="text-3xl text-slate-100 font-bold text-center">
                Detalhes da TAREFA
            </h1>
        </div>
        <div className="bg-slate-300 p-4 rounded-md">
            <h2 className="text-xl font-bold text-slate-700">{title}</h2>
            <p className="text-slate-700">{description}</p>
        </div>
        
      </div>
    </div>
);
}

export default TaskPage;