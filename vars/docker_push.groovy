def call(String Project, String ImageTag, String dockerhubuser){
		echo "Pushing image to Docker Hub..............."
                withCredentials([usernamePassword(credentialsId:"dockerhub",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
                sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
                sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
}
