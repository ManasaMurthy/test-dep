node {
  def sbtHome = tool 'default-sbt'
  env.PATH = "${sbtHome}/bin:${env.PATH}"

  stage 'Build'
  sh 'sbt package'

  stage 'Publish-Local'
  sh 'sbt publish-local'
}

