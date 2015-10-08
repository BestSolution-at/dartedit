#!/bin/sh

MAVEN=/Users/tomschindl/Applications/apache-maven-3.2.5/bin/mvn
ASSEMBLY_ZIP=/tmp/site_assembly.zip
ASSEMBLY_ROOT=/Users/tomschindl/Desktop/dart-export/plugins
REPO_ID=sonatype
REPO_URL=https://oss.sonatype.org/service/local/staging/deploy/maven2/

## ----------------------------------------------------------------
## org.eclipse.text
## ----------------------------------------------------------------

POM=/Users/tomschindl/git/dartedit/bundles/at.bestsolution.dart.server.api/maven_pom.xml
$MAVEN gpg:sign-and-deploy-file \
	-DpomFile=$POM \
	-Dfile=$ASSEMBLY_ROOT/at.bestsolution.dart.server.api_1.0.0.201508250203.jar \
	-DrepositoryId=$REPO_ID \
	-Durl=$REPO_URL

## FIXME Needs to be in target
$MAVEN gpg:sign-and-deploy-file \
	-DpomFile=$POM \
	-Dfile=$ASSEMBLY_ROOT/at.bestsolution.dart.server.api.source_1.0.0.201508250203.jar \
	-DrepositoryId=$REPO_ID \
	-Durl=$REPO_URL \
	-Dclassifier=sources

rm -rf /tmp/javadoc
mkdir /tmp/javadoc
javadoc -d /tmp/javadoc -sourcepath $ASSEMBLY_ROOT/at.bestsolution.dart.server.api.source_1.0.0.201508250203.jar -subpackages at.bestsolution.dart.server.api
cd /tmp/javadoc
zip -r javadoc.jar *

$MAVEN gpg:sign-and-deploy-file \
	-DpomFile=$POM \
	-Dfile=/tmp/javadoc/javadoc.jar \
	-DrepositoryId=$REPO_ID \
	-Durl=$REPO_URL \
	-Dclassifier=javadoc

cd -