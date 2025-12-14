stage('Build')
        {
           steps
           {
              sh "mvn clean package"
           }
        }
        stage('SonarQubeReports')
        {
           steps
           {
              sh "mvn sonar:sonar"
           }
        } 
        stage('Deploy to Nexus')
        {
           steps
           {
              sh "mvn clean deploy"
           }
        }
