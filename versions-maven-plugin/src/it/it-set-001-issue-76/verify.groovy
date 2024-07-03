import groovy.xml.XmlSlurper

def project = new XmlSlurper().parse(new File(basedir, 'pom.xml'))
assert project.version == '2.3'
assert project.dependencies.dependency[0].version == '2.2'
