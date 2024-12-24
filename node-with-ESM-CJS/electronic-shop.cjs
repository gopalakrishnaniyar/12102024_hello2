function getmaxItems(keyBoard,usbDrives,b,temp){

//const b = 60;
//const keyBoard = [50,40,60];
//const usbDrives = [5,8,12,9];


console.log(temp.split(' '))

const keyBoardSort  = keyBoard.sort((x, y) => y-x)
//console.log(keyBoardSort)
const usbDrivesSort = usbDrives.sort((x, y) => y-x)
//console.log(usbDrivesSort)
for(const item of keyBoardSort){
    for(const drive of usbDrivesSort){
        if( item+drive <= b){return item+drive}
    }
}
}

const totals = getmaxItems([50,40,60],[5,8,12],60,'50 20 21');
console.log(totals);