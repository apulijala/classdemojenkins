pipeline {

    agent {
        /* 
            Run on docker, but use the host labeled as 'east'
            It will try to launch a docker container on this machine. 
            docker has to be installed and connecte to master either by ssh/jnlp
            docker {
                image 'python:3'
                label  'east && demo'
            }

            label  'east && demo'
        */
        label  'east'
    }
     parameters {
        string( name : "hostname", defaultValue: "demo-dev", description : "Hostname"   )
        booleanParam(name :"yesno", defaultValue: false, description : "Checkbox" )
        text(name : "story", defaultValue :"Default value of the story", 
                description : "Default value of the Story")
        password(name : "secret", 
                defaultValue :"password", 
                description: "Enter the password")
        file(description : "Choose file to upload ", name : "myfile")
        choice(name: 'planet', choices: ['Mercury', 'Venus', 'Mars'], description: 'Choose Planet')
    }



    stages {
        stage("Compile") {
            agent {
                docker ({
                    image 'python:3'
                    label  'east'
                })
            }
            steps {
                
                echo "Running the compile phase ${params.hostname}"
                script {
                    if (yesno) {
                        sh 'python3 -m compileall adder.py' 
                    }else {
                        echo "Compilation not required"
                    }
                   switch(planet) {            
                //There is case statement defined for 4 cases 
                // Each case statement section has a break condition to exit the loop 
                    
                    case "Mercury": 
                        println("Planet is Mercury"); 
                        break; 
                    case "Venus": 
                        println("Planet is Venus"); 
                        break; 
                    default: 
                        println("The value is unknown"); 
                        break; 
      }
   }
                    println("${pla}")
                    
                }
                
            }
            post{

                always{
                    echo "This will always run."
                }
                
                success{
                    echo "Build was successful"
                }
                
                failure{
                    echo "Build failed"
                }
            }
        }

    }
}