package developing_on_AWS_Services_Overview;
/*
 * -----------------Course objectives------------------------------
 * what is amazon web services ?
 * AWS compute services!
 * AWS storage services!
 * AWS database services!
 * AWS Networking services!
 * AWS developer tools!
 * AWS identity and monitoring services!
 * -------------------Introduction to Amazon web services--------------------------
 * Public cloud service provider launched in 2006.
 * provide over 175 fully featured services related to compute storage,networking,Content delivery network(CDN),ML,ioT,etc
 * services accessible from any where ,any time,on a pay per use pricing model.
 * Web based management console,CLI and SDK.
 * --------------------!Why AWS ?---------------------------------------------
 * More functionality than any other CSP.
 * More Secure.
 * Fastest pace of innovation.
 * Most proven operational expertise.
 * ----------------------!AWS Infrastructure------------------------------------------------
 * Region present globally
 * each region more than 2 availibility zone.
 * AWS has 77 availibility zone.
 * --------------------------!Other AWS Infrastructure Components----------------
 * Points of presence.
 * AWS Wavelength
 * AWS local zones.
 * -------------------------------------------------AWS Account Creation-----------------------------------
 * -------------------------------------------------Introduction to Amazon EC2(Amazon elastic compute cloud)----------------------------------
 * What is EC2?:-
AWS defines it as Elastic Compute Cloud.

It’s a virtual environment where “you rent” to have your environment created, without purchasing. 

Amazon refers to these virtual machines as Instances.

Preconfigured templates can be used to launch instances. These templates are referred to as images. Amazon provides these images in the form of AMIs (Amazon Machine Images).

Allows you to install custom applications and services.

Scaling of infrastructure i.e., up or down is easy based on the demand you face.

AWS provides multiple configurations of CPU, memory, storage etc., through which you can pick the flavor that's required for your environment.

No limitation on storage. You can pick the storage based on the type of the instance that you are working on.

Temporary storage volumes are provided, which are called Instance Store Volumes.  Data stored in this gets deleted once the instance is terminated.

Persistent storage volumes are available and are referred to as EBS (Elastic Block Store) volumes.

These instances can be placed at multiple locations which are referred to as Regions and Availability Zones (AZ).

You can have your Instances distributed across multiple AZs i.e., within a single Region, so that if an instance fails, AWS automatically remaps the address to another AZ.

Instances deployed in one AZ can be migrated to another AZ.

To manage instances, images, and other EC2 resources, you can optionally assign your own metadata to each resource in the form of tags.

A Tag is a label that you assign to an AWS resource.  It contains a key and an optional value, both of which are defined by you.

Each AWS account comes with a set of default limits on the resources on a per-Region basis.

For any increase in the limit you need to contact AWS.

To work with the created instances, we use Key Pairs. 


 *   --------------------------------!Why EC2?-----------------------------------------------------
 *   1-Provide scalable computing capacity.
 *   2-Launch as many as or few virtual severs as you need.
 *   3-configure security and networking.
 *   4-Manage storage.
 *   --------------------------------------!Amazon EC2 features------------------------------------
 *   1-Amazon machine image
 *   2-Instance types
 *   3-Key pairs
 *   4-Instance store volumes.
 *   5-Amazon EBS volumes.
 *   6-Regions and availability zones
 *   7-Security groups.
 *   8-Elastic IP addresses.
 *   9-Tags
 *   10-Virtual private cloud
 *   --------------------------------------Amazon EC2 Pricing models---------------------------------------
 *   1-On demand instances
 *   No up-front payment or long term commitment
 *   Workloads that cannot be interrupted
 *   Developed or tested on amazon EC2 for the first time.
 *   2-Spot Instances
 *   Flexible start and end times.
 *   Very low compute prices
 *   Urgent computing needs
 *   3-Reserved Instances-
 *   Application with steady state usage
 *   Applications that need reserved capacity
 *   Available for 1 or 3 year term.
 * ----------------------------------------------------Amazon Elastic Block store(EBS)--------------------------------
 * --------------------------------------------------Amazon EC2 instance creation demo----------------------
 * Objective-Launch a linux EC2 instance using AWS management console.
 * Prerequisite:
 * AWS account
 * IAM permission for EC2 service
 * 
 * ----------------------------------------Connect to EC2 instance demo---------------------------
 * Objective:Make SSH connection to a linux EC2 instance and deploy a sample PHP application on it.
 * Connect to a linux EC2 instance using SSH connection from a window machine
 * deploy a sample PHP application on a linux EC2 instance.
 * ------------------------------Prerequisite-------------------------
 * AWS account
 * IAM permissions for EC2 service
 * An already running Linux EC2 instance with port 22 open.
 * Putty and Puttygen.
 * -----------------------------------------Introduction to AWS Elastic Beanstalk----------------------------------
 * AWS Elastic Beanstalk is a compute service provide by AWS
 * In simple words Elastic Beanstalk is an automatic application deployment service.
 *  It is the easiest possible way to deploy your applications on AWS even with possibly 
 *  no prior experience on the platform.


 * Deploy and scale application easily.
 * Support java,.Net,PHP,Node.js,Python,Ruby,Go,and docker.
 * Resource deployment automation.
 * Keep full control over the AWS resources.
 * -------!Steps to create an Elastic Beanstalk application--------
 * create an elastic beanstalk application
 * choose environment and instance type.
 * select additional resources.
 * upload your code.
 * -------------------------------Introduction to AWS Lambda------------------------------------------
 * AWS lambda is a service which compute the code without any server.It is said to be serverless compute.
 The code is executed based on the response of events in AWS services such as adding/removing files in s3 
 bucket,updating Amazon DynamoDB tables,HTTP request from amazon API gateway etc.
 * --------------------------AWS STORAGE SERVICES--------------------------------
 * Introduction to Amazon S3(Simple storage service)-:
 * AWS Storage Services: AWS offers a wide range of storage services 
 * that can be provisioned depending on your project requirements 
 * and use case. AWS storage services have different provisions for highly 
 * confidential data, frequently accessed data, and the not so frequently accessed data.
 *  You can choose from various storage types namely, object storage, file storage, 
 *  block storage services, backups, and data migration options. All of which fall 
 *  under the AWS Storage Services list. 
 
 AWS Simple Storage Service (S3): From the aforementioned list, S3, is the object storage service provided by AWS. It is probably the most commonly used, go-to storage service for AWS users given the features like extremely high availability, security, and simple connection to other AWS Services. AWS S3 can be used by people with all kinds of use cases like mobile/web applications, big data, machine learning and many more.

AWS S3 Terminology:

Bucket: Data, in S3, is stored in containers called buckets.
Each bucket will have its own set of policies and configuration. This enables users to have more control over their data.
Bucket Names must be unique.
Can be thought of as a parent folder of data.
There is a limit of 100 buckets per AWS accounts. But it can be increased if requested from AWS support.
Bucket Owner: The person or organization that owns a particular bucket is its bucket owner.
Import/Export Station:  A machine that uploads or downloads data to/from S3.
Key: Key, in S3, is a unique identifier for an object in a bucket. For example in a bucket ‘ABC’ your GFG.java file is stored at javaPrograms/GFG.java then ‘javaPrograms/GFG.java’ is your object key for GFG.java.
It is important to note that ‘bucketName+key’ is unique for all objects.
This also means that there can be only one object for a key in a bucket. If you upload 2 files with the same key. The file uploaded latest will overwrite the previously contained file.
Versioning:  Versioning means to always keep a record of previously uploaded files in S3. Points to note:
Versioning is not enabled by default. Once enabled, it is enabled for all objects in a bucket.
Versioning keeps all the copies of your file, so, it adds cost for storing multiple copies of your data. For example, 10 copies of a file of size 1GB will have you charged for using 10GBs for S3 space.
Versioning is helpful to prevent unintended overwrites and deletions.
Note that objects with the same key can be stored in a bucket if versioning is enabled (since they have a unique version ID).
null Object: Version ID for objects in a bucket where versioning is suspended is null. Such objects may be referred to as null objects.
For buckets with versioning enabled, each version of a file has a specific version ID.
Object: Fundamental entity type stored in AWS S3.
Access Control Lists (ACL): A document for verifying the access to S3 buckets from outside your AWS account. Each bucket has its own ACL.
Bucket Policies: A document for verifying the access to S3 buckets from within your AWS account, this controls which services and users have what kind of access to your S3 bucket. Each bucket has its own Bucket Policies.
Lifecycle Rules: This is a cost-saving practice that can move your files to AWS Glacier (The AWS Data Archive Service) or to some other S3 storage class for cheaper storage of old data or completely delete the data after the specified time.
Features of AWS S3:

Durability: AWS claims Amazon S3 to have a 99.999999999% of durability (11 9’s). This means the possibility of losing your data stored on S3 is one in a billion.
Availability: AWS ensures that the up-time of AWS S3 is 99.99% for standard access.
Note that availability is related to being able to access data and durability is related to losing data altogether.
Server-Side-Encryption (SSE): AWS S3 supports three types of SSE models:
SSE-S3: AWS S3 manages encryption keys.
SSE-C: The customer manages encryption keys.
 SSE-KMS: The AWS Key Management Service (KMS) manages the encryption keys.
File Size support: AWS S3 can hold files of size ranging from 0 bytes to 5 terabytes. A 5TB limit on file size should not be a blocker for most of the applications in the world.
Infinite storage space: Theoretically AWS S3 is supposed to have infinite storage space. This makes S3 infinitely scalable for all kinds of use cases.
Pay as you use: The users are charged according to the S3 storage they hold.
AWS-S3 is region-specific.
S3 storage classes:

AWS S3 provides multiple storage types that offer different performance and features and different cost structure. 

Standard: Suitable for frequently accessed data, that needs to be highly available and durable.
Standard Infrequent Access (Standard IA): This is a cheaper data-storage class and as the name suggests, this class is best suited for storing infrequently accessed data like log files or data archives. Note that there may be a per GB data retrieval fee associated with Standard IA class.
Intelligent Tiering: This service class classifies your files automatically into frequently accessed and infrequently accessed and stores the infrequently accessed data in infrequent access storage to save costs. This is useful for unpredictable data access to an S3 bucket.
One Zone Infrequent Access (One Zone IA): All the files on your S3 have their copies stored in a minimum of 3 Availability Zones. One Zone IA stores this data in a single availability zone. It is only recommended to use this storage class for infrequently accessed, non-essential data. There may be a per GB cost for data retrieval.
Reduced Redundancy Storage (RRS): All the other S3 classes ensure the durability of 99.999999999%. RRS only ensures a 99.99% durability. AWS no longer recommends RRS due to its less durability. However, it can be used to store non-essential data.


 
 * Why S3 ?
 * Object storage service
 * Provide easy-to-use management features.
 * Durability of 11 9's.
 * Amazon S3 features:-
 * Store as much as you need to
 * keep multiple versions of objects.
 * host static website
 * replication of data.
 * Pay as you use
 * storage class
 * Amazon S3 use cases:-
 * backup and restore
 * disaster recovery
 * archive data
 * big data analytics
 * hybrid cloud storage.
 * cloud-native applications
 * --------------------AWS S3 storage classes-------------------------
 * S3 standard
 * S3 standard-IA
 * S3 Intelligent-tiering
 * S3 one Zone-IA
 * S3 Glacier
 * S3 Glacier deep archive.
 * ----------------Amazon S3 bucket creation-----------------
 * Objective:-
 * Create an S3 bucket.
 * Upload an object into the bucket.
 * delete the object
 * delete the bucket.
 * ----------------Amazon S3 Lifecycle rules--------------------------
 * ----------------Amazon Elastic file system------------------------
 
 AWS Elastic File System: From the aforementioned list, EFS falls under the file storage category.
  EFS is a file-level, fully managed, storage provided by AWS that can be accessed by 
  multiple EC2 instances concurrently. Just like the AWS EBS, EFS is specially designed 
  for high throughput and low latency applications. 

Different Storage Classes in AWS EFS:
Standard storage class:
This is the default storage class for EFS.
The user is only charged for the amount of storage used.
This is recommended for storing frequently accessed files.
Infrequently Accessed storage class:
Cheaper storage space.
Recommended for rarely accessed files.
Increased latency when reading or writing files.
The user is charged not only for the storage of files but also charged for read and write operations.
Different Performance Modes in EFS:
General-purpose:
Offers low latency.
Supports a maximum of 7000 IOPS.
As a cloudwatch metric, you can view the amount of IOPS your architecture uses and can switch to Max IOPS if required.
Max I/O:
This is recommended when EFS needs over 7000 IOPS
Theoretically, this mode has an unlimited I/O speed.
Different Throughput Modes in EFS:
Burst Mode: Allows 100MBPS of burst speed per TB of storage.
Provisioned Mode: Users can decide the max burst speed of the EFS but are charged more when speeds go beyond the default limit.
Connecting to EFS:
Create an EFS from the AWS console. Chose the correct VPC and configuration that suits your use case.
Create one or more EC2 servers as needed for your use case.
Allow the EC2 security group to access EFS.
Connect To EFS from your EC2 servers. Primarily there are 2 methods of connecting to EFS from EC2 servers:
Linux NFS Client: This is the old traditional method of connecting to file systems.
EFS Mount Helper: This is the AWS recommended and simpler solution to connect to EFS.
Once you have connected to AWS EFS from your EC2 instances you will have a folder of any name (say EFS-Folder) which will hold all the files in the EFS. Any file created in this directory can be seen or edited from any EC2 instances that have access to the EFS.
Features of AWS EFS:
Storage capacity: Theoretically EFS provides an infinite amount of storage capacity. This capacity grows and shrinks as required by the user.
Fully Managed: Being an AWS managed service, EFS takes the overhead of creating, managing, and maintaining file servers and storage.
Multi EC-2 Connectivity: EFS can be shared between any number of EC-2 instances by using mount targets.
Note-: A mount target is an Access point for AWS EFS that is further attached to EC2 instances, allowing then access to the EFS.
Availability: AWS EFS is region specific., however can be present in multiple availability zones in a single region.
EC-2 instances across different availability zones can connect to EFS in that zone for a quicker access
EFS LifeCycle Management: Lifecycle management moved files between storage classes. Users can select a retention period parameter (in number of days). Any file in standard storage which is not accessed for this time period is moved to Infrequently accessed class for cost-saving.
Note that the retention period of the file in standard storage resets each time the file is accessed
Files once accessed in the IA EFS class are them moved to Standard storage.
Note that file metadata and files under 128KB cannot be transferred to the IA storage class.
LifeCycle management can be turned on and off as deemed fit by the users.
Durability: Multi availability zone presence accounts for the high durability of the Elastic File System.
Transfer: Data can be transferred from on-premise to the EFS in the cloud using AWS Data Sync Service. Data Sync can also be used to transfer data between multiple EFS across regions.\


The above image shows an Elastic File System shared between two instances which are further connected to their own EBS volumes. The following are some use cases of EFS:

Multiple server architectures: In AWS only EFS provides a shared file system. So all the applications that require multiple servers to share one single file system have to use EFS.
Big Data Analytics: Virtually infinite capacity and extremely high throughput makes EFS highly suitable for storing files for Big data analysis.
Reliable data file storage: EBS data is stored redundantly in a single Availability Zone however EFS data is stored redundantly in multiple Availability Zones. Making it more robust and reliable than EBS.
Media Processing: High capacity and high throughput make EFS highly favorable for processing big media files.

 
 * -------------------------------Amazon Fsx for windows File server-----------------------------
 * What is Amazon FSx for windows File server ?
 * Fully managed native windows file system
 * Deeply integrated with AWS.
 * Fully managed means you no longer need to...........
 * Manage hardware:-plan capacity,procure and purchase hardware,set up storage servers and volumes
 ,Detect and address hardware failures Invest CapEx
 * Manage software:-Install and configure server software,set up and configure file systems,apply windows updates
 Manage software licences,Manage backups,Monitor security
 * ----------------------AWS Networking Services--------------------
 * Introduction to Amazon VPC (Virtual private cloud):-
 * Why Amazon VPC ?
 * provision a logically isolated section.
 * have complete control over your virtal networking environment
 * Easily customize the network configuration
 * use multiple layers of security.
 * Amazon VPC Components:-
 * subnet
 * route table
 * Internet gateway
 * NAT gateway
 * VPC endpoints
 * VPC peering.
 * ---------------!Amazon VPC demo---------------
 * Objective:-Create a custom VPC with one public subnet.
 * Prerequisite:-AWS account,IAM permission for VPC service.
 * -------------Introduction to Amazon cloud front--------------------------
 * Fast,Highly secure,Programmable content delivery network.
 * By using it we can deliver both static and dynamic content.
 * -----------Introduction to Amazon Route53----------------
 * It is a DNS service.
 * 
 * 
 *   
 *   
 *   
 * 
 */
public class Developing_on_AWS_Services_Overview {

}
