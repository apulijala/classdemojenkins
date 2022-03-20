pipeline {

    agent {
        /* 
            Run on docker, but use the host labeled as 'east'
            It will try to launch a docker container on this machine. 
            docker has to be installed and connecte to master either by ssh/jnlp
        */

        docker {
            image 'python:3'
            label 'east && thismachine'
            
        }
}

    stages {
        stage("First Stage"){
            steps{
                echo "Demo Stage"
            }
          
        }
    }
}