// javascript code goes here
const box = document.getElementById('animation-box');
const xSlider = document.getElementById('anim-x');
const ySlider = document.getElementById('anim-y');
const scaleSlider = document.getElementById('anim-scale');
const rotationSlider = document.getElementById('anim-rotation');
const durationSlider = document.getElementById('anim-duration');
const xLabel = document.getElementById('anim-x-label');
const yLabel = document.getElementById('anim-y-label');
const scaleLabel = document.getElementById('anim-scale-label');
const rotationLabel = document.getElementById('anim-rotation-label');
const durationLabel = document.getElementById('anim-duration-label');

function changeHandler() {
  const x = xSlider.value + '%';
  const y = ySlider.value + '%';
  const scale = scaleSlider.value;
  const rotation = rotationSlider.value + 'deg';
  const duration = durationSlider.value + 's';

  box.style.transition = `transform ${duration}`;
  box.style.transform = `translate(${x}, ${y}) scale(${scale}) rotate(${rotation})`;

  xLabel.textContent = `X: ${x}`;
  yLabel.textContent = `Y: ${y}`;
  scaleLabel.textContent = `Scale: ${scale}`;
  rotationLabel.textContent = `Rotation: ${rotation}`;
  durationLabel.textContent = `Duration: ${duration}`;
}

xSlider.addEventListener('input', changeHandler);
ySlider.addEventListener('input', changeHandler);
scaleSlider.addEventListener('input', changeHandler);
rotationSlider.addEventListener('input', changeHandler);
durationSlider.addEventListener('input', changeHandler);
