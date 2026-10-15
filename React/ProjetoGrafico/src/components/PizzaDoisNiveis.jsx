import { Pie, PieChart, Tooltip } from "recharts";

const data01 = [
  { name: "Nike", value: 450 },
  { name: "Adidas", value: 350 },
  { name: "Puma", value: 250 },
  { name: "New Balance", value: 200 },
];

const data02 = [
  { name: "Air Max", value: 200 },
  { name: "Air Force 1", value: 250 },
  { name: "Ultraboost", value: 150 },
  { name: "Superstar", value: 200 },
  { name: "Suede Classic", value: 100 },
  { name: "RS-X", value: 150 },
  { name: "574", value: 120 },
  { name: "550", value: 80 },
  { name: "Fresh Foam", value: 100 },
  { name: "Outros", value: 50 },
];

export default function PizzaDoisNiveis({    isAnimationActive = true,
    defaultIndex = 0}) {

  return (
    <PieChart
      style={{
        width: "100%",
        height: "100%",
        maxWidth: "500px",
        maxHeight: "80vh",
        aspectRatio: 1,
      }}
      responsive
    >
      <Pie
        data={data01}
        dataKey="value"
        cx="50%"
        cy="50%"
        outerRadius="50%"
        fill="#332f7c"
        stroke="white"
        isAnimationActive={isAnimationActive}
      />
      <Pie
        data={data02}
        dataKey="value"
        cx="50%"
        cy="50%"
        innerRadius="60%"
        outerRadius="80%"
        fill="#2a9553"
        stroke="white"
        label
        isAnimationActive={isAnimationActive}
      />
      <Tooltip defaultIndex={defaultIndex} />
    </PieChart>
  );
}
