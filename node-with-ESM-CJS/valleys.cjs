const steps = 'UDDDUDDUU'
const stepArray = steps.split('');
console.log(Math.abs(stepArray.filter(item => item == 'U').length - stepArray.filter(item => item == 'D').length))