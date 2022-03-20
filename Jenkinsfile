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

    stages {
        stage("Compile") {
             docker {
                image 'python:3'
                label  'east'
            }
            steps{
                echo "Running the compile phase"
                sh 'python3 -m compileall adder.py' 
            }
        }

        stage("Test") {
             docker {
                image 'python:3'
                label  'east'
            }
            steps {
                echo "Running the Test phase"
                sh 'python3 -m unittest adder.py' 
            }
        }

        post {
            echo "All done"
        }

    }

}