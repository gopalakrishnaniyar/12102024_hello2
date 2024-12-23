function countingValleys(steps, path) 
{
    var valleyCounter = 0;
    var baseLevel = 0;
    for (const i of path) {
        baseLevel += (i === 'U') ? 1 : -1;
        if (baseLevel === 0 && i === 'U') {
            valleyCounter++;
        }
    }
    
    return valleyCounter;
}
console.log(countingValleys(8,'UDDDUDUUDU'));
/*
function countingValleys(steps, path) {
const stepArray = path.split('');
var baseLevel = 0 ;
var valleyCounter = 0;
for (let index = 0; index < stepArray.length; index++) {
    const element = stepArray[index];
    
    if (element === 'U') {
        baseLevel++;
    } else {
        baseLevel--;
    }
    if(baseLevel == 0 && stepArray[index] === 'U') {valleyCounter++;}
}
return valleyCounter;

}
*/