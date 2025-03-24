def cal(){
	echo "Deploying the container..............."
        sh "docker-compose down && docker-compose up -d"
}
