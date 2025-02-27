pipeline {
 agent any 
  stages {
    stage ('checking'){
      steps {
        git branch: 'master', url: 'https://github.com/ADirin/sep1_week6_timecal_demo.git'
        
      }
    }

    satge (build) {
      steps{
        bat 'mvn clean install'
      }
      
    }
  }
  
}
