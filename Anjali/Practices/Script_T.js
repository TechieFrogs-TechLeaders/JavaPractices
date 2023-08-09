            var i=5;
            var a=4;
            console.log(i);
            /* {
                let b=8;
                console.log(b);
            }*/
            var sum=i+a;
            console.log(sum);
            {
                c=78;
                console.log(c);//var is a global var
                var c;
                let y=6.9;//let is block leve; var
                console.log(y);
                /*z=68;
                console.log(z);
                let z;//we cannot access z before initialization*/
            }
            var d=10;
            {
                var d=30;
                console.log(d);
                let u=9;
                console.log(u);
                //let u=8;  no duplicate values
            }
            
