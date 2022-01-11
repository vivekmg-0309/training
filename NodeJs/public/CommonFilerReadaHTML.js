const http=require('http');
const path=require('path');
const fs = require('fs');

const server = http.createServer((req,res)=>{
    //build file path
    let filepath = path.join(__dirname,"public",req.url ==="/" ? "index.html": req.url);

    //extension of the file
    let extname = path.extname(filepath);

    //intial content oof the file 
    let contentType = "text/html";

    //check ext and set content type
    switch (extname){
        case ".js":
            contentType="text/javascript";
        break;
        case ".json":
            contentType= "application/json";
        break;
        case ".png":
            contentType ="image/png";
        break;
        case ".jpg":
            contentType="image/jpg"
            break;
            //Check if contentType is text/html but no.html file extension
            if (contentType == "text/html" && extname == "") filepath+=".html";

            //log the filepath
            console.log(filepath);

            //read file
            fs.readFile(filepath, (err, content)=>{
                if (err){
                    if (err.code == "ENOENT"){
                        //page not found
                        fs.readFile(
                            path.join(__dirname, "public", "404.html"),
                            (err, content)=>{
                                res.writeHead(404,{"Content-Type": "text/html"});
                                res.end(content, "utf8");
                            }
                        );
                    }else {
                        //some server error
                        res.writeHead(500);
                        res.end(`Server Error: ${err.code}`);
                    }
                }else {
                    //success
                    res.writeHead(200, {"Content-Type": content});
                    res.end(content, "utf8");
                }
            });

    }
});

const PORT = process.env.PORT || 5000;

server.listen(PORT, ()=> console.log(`server running on port ${PORT}`))