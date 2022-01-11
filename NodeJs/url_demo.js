const url = require('url');
const myUrl= new URL ('http://localhost:8080/hello.html?id=100&status=active');

//Host (root domain)
console.log(myUrl.host);

//Host name (does not get the port number)
console.log(myUrl.hostname);

//Pathname
console.log(myUrl.pathname);

//Serialized query
console.log(myUrl.search);

//Params object
console.log(myUrl.searchParams);

//Add params
myUrl.searchParams.append('adc','123');
console.log(myUrl.searchParams);

//Loop the params
myUrl.searchParams.forEach((value,name)=>console.log(`${name}:${value}`));