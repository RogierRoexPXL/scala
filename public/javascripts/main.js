
const colors = [
    "bg-primary",
    "bg-secondary",
    "bg-success",
    "bg-danger",
    "bg-warning",
    "bg-info",
    "bg-light",
    "bg-dark",
    "bg-white"
];

const textColors = [
    "text-primary",
    "text-secondary",
    "text-success",
    "text-danger",
    "text-warning",
    "text-info",
    "text-light",
    "text-dark",
    "text-muted",
    "text-white"
];

function applyColors(backgroundClass, textClass) {
    document.body.classList.remove(...colors);
    document.body.classList.remove(...textColors);
    document.body.classList.add(backgroundClass);
    document.body.classList.add(textClass);
}

function applyRandomColors() {
    const randomColor = colors[getRandomNumber(colors.length)];
    const randomTextColor = textColors[getRandomNumber(textColors.length)];
    applyColors(randomColor, randomTextColor);
}

function getRandomNumber(max) {
    return Math.floor(Math.random() * max);
}

const button = document.getElementById("changeColorButton");
button.addEventListener("click", applyRandomColors);
