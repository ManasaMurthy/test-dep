node {
  def sbtHome = tool 'default-sbt'
  env.PATH = "${sbtHome}/bin:${env.PATH}"

  stage 'Checkout'
  git url: 'http://10.236.246.220:9090/crodav/test-dep.git'

  stage 'Build'
  sh "sbt package"
}

