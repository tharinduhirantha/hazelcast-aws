# hazelcast-aws

Final jar : 'hazelcast-aws.jar'

Run parameters are : 'insert','read'.

Insert mode will insert records in to a map in every 5 second. And Read mode will read the map in every 1 second.

# Policy for IAM Role

{
  "Version": "XXXXXXXX",
  "Statement": [
    {
      "Sid": "XXXXXXXX",
      "Action": [
        "ec2:DescribeInstances"
      ],
      "Effect": "Allow",
      "Resource": "*"
    }
  ]
}

# Command :
java -jar  /hazelcast-aws/target/hazelcast-aws.jar insert
