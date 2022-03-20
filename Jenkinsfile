pipeline {
    agent {
       
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
                }
                println("${planet}")

                script {
                     def loginInformation = input message : "Login", 
                                        parameters : [
                                        string(defaultValue : "Login", name : "userid", 
                                         description : "Enter userid"), 
                                        password(defaultValue : "passwd", 
                                            description: "Enter Password", 
                                            name : "passwd"
                                        )

                                    ]
                }
            }
                
        }
    }
}
