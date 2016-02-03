package com.sap.coe.sf;

import java.util.List;
import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;



/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.6 in JDK 6 Generated
 * source version: 2.1
 * 
 */
@WebService(name = "SFAPI",
			targetNamespace = "urn:server.sfapi.successfactors.com")
@XmlSeeAlso(
{ ObjectFactory.class })
public interface SFAPI
{
	
	/**
	 * 
	 * @param param
	 * @param credential
	 * @return returns com.sap.coe.sf.LoginResult
	 * @throws SFWebServiceFaultException_Exception
	 */
	@WebMethod
	@WebResult(	name = "result",
				targetNamespace = "urn:sfobject.sfapi.successfactors.com")
	@RequestWrapper(localName = "login",
					targetNamespace = "urn:sfobject.sfapi.successfactors.com",
					className = "com.sap.coe.sf.Login")
	@ResponseWrapper(	localName = "loginResponse",
						targetNamespace = "urn:sfobject.sfapi.successfactors.com",
						className = "com.sap.coe.sf.LoginResponse")
	public
			LoginResult
			login(@WebParam(name = "credential",
							targetNamespace = "urn:sfobject.sfapi.successfactors.com") SFCredential credential,
					@WebParam(	name = "param",
								targetNamespace = "urn:sfobject.sfapi.successfactors.com") List<SFParameter> param)
					throws SFWebServiceFaultException_Exception;
	
	
	/**
	 * 
	 * @return returns boolean
	 * @throws SFWebServiceFaultException_Exception
	 */
	@WebMethod
	@WebResult(	name = "result",
				targetNamespace = "urn:sfobject.sfapi.successfactors.com")
	@RequestWrapper(localName = "isValidSession",
					targetNamespace = "urn:sfobject.sfapi.successfactors.com",
					className = "com.sap.coe.sf.IsValidSession")
	@ResponseWrapper(	localName = "isValidSessionResponse",
						targetNamespace = "urn:sfobject.sfapi.successfactors.com",
						className = "com.sap.coe.sf.IsValidSessionResponse")
	public
			boolean
			isValidSession() throws SFWebServiceFaultException_Exception;
	
	
	/**
	 * 
	 * @param parameters
	 * @return returns com.sap.coe.sf.DescribeSFObjectsResponse
	 * @throws SFWebServiceFaultException_Exception
	 */
	@WebMethod
	@WebResult(	name = "describeSFObjectsResponse",
				targetNamespace = "urn:sfobject.sfapi.successfactors.com",
				partName = "parameters")
	@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
	public
			DescribeSFObjectsResponse
			describe(
					@WebParam(	name = "describeSFObjects",
								targetNamespace = "urn:sfobject.sfapi.successfactors.com",
								partName = "parameters") DescribeSFObjects parameters)
					throws SFWebServiceFaultException_Exception;
	
	
	/**
	 * 
	 * @param parameters
	 * @return returns com.sap.coe.sf.DescribeSFObjectsExResponse
	 * @throws SFWebServiceFaultException_Exception
	 */
	@WebMethod
	@WebResult(	name = "describeSFObjectsExResponse",
				targetNamespace = "urn:sfobject.sfapi.successfactors.com",
				partName = "parameters")
	@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
	public
			DescribeSFObjectsExResponse
			describeEx(
					@WebParam(	name = "describeSFObjectsEx",
								targetNamespace = "urn:sfobject.sfapi.successfactors.com",
								partName = "parameters") DescribeSFObjectsEx parameters)
					throws SFWebServiceFaultException_Exception;
	
	
	/**
	 * 
	 * @return returns boolean
	 * @throws SFWebServiceFaultException_Exception
	 */
	@WebMethod
	@WebResult(	name = "result",
				targetNamespace = "urn:sfobject.sfapi.successfactors.com")
	@RequestWrapper(localName = "logout",
					targetNamespace = "urn:sfobject.sfapi.successfactors.com",
					className = "com.sap.coe.sf.Logout")
	@ResponseWrapper(	localName = "logoutResponse",
						targetNamespace = "urn:sfobject.sfapi.successfactors.com",
						className = "com.sap.coe.sf.LogoutResponse")
	public
			boolean
			logout() throws SFWebServiceFaultException_Exception;
	
	
	/**
	 * 
	 * @param parameters
	 * @return returns com.sap.coe.sf.ListSFObjectsResponse
	 * @throws SFWebServiceFaultException_Exception
	 */
	@WebMethod
	@WebResult(	name = "listSFObjectsResponse",
				targetNamespace = "urn:sfobject.sfapi.successfactors.com",
				partName = "parameters")
	@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
	public
			ListSFObjectsResponse
			list(@WebParam(	name = "listSFObjects",
							targetNamespace = "urn:sfobject.sfapi.successfactors.com",
							partName = "parameters") ListSFObjects parameters)
					throws SFWebServiceFaultException_Exception;
	
	
	/**
	 * 
	 * @param queryString
	 * @param param
	 * @return returns com.sap.coe.sf.QueryResult
	 * @throws SFWebServiceFaultException_Exception
	 */
	@WebMethod
	@WebResult(	name = "result",
				targetNamespace = "urn:sfobject.sfapi.successfactors.com")
	@RequestWrapper(localName = "query",
					targetNamespace = "urn:sfobject.sfapi.successfactors.com",
					className = "com.sap.coe.sf.Query")
	@ResponseWrapper(	localName = "queryResponse",
						targetNamespace = "urn:sfobject.sfapi.successfactors.com",
						className = "com.sap.coe.sf.QueryResponse")
	public
			QueryResult
			query(@WebParam(name = "queryString",
							targetNamespace = "urn:sfobject.sfapi.successfactors.com") String queryString,
					@WebParam(	name = "param",
								targetNamespace = "urn:sfobject.sfapi.successfactors.com") List<SFParameter> param)
					throws SFWebServiceFaultException_Exception;
	
	
	/**
	 * 
	 * @param querySessionId
	 * @return returns com.sap.coe.sf.QueryResult
	 * @throws SFWebServiceFaultException_Exception
	 */
	@WebMethod
	@WebResult(	name = "result",
				targetNamespace = "urn:sfobject.sfapi.successfactors.com")
	@RequestWrapper(localName = "queryMore",
					targetNamespace = "urn:sfobject.sfapi.successfactors.com",
					className = "com.sap.coe.sf.QueryMore")
	@ResponseWrapper(	localName = "queryMoreResponse",
						targetNamespace = "urn:sfobject.sfapi.successfactors.com",
						className = "com.sap.coe.sf.QueryMoreResponse")
	public
			QueryResult
			queryMore(
					@WebParam(	name = "querySessionId",
								targetNamespace = "urn:sfobject.sfapi.successfactors.com") String querySessionId)
					throws SFWebServiceFaultException_Exception;
	
	
	/**
	 * 
	 * @param processingParam
	 * @param type
	 * @param sfobject
	 * @return returns com.sap.coe.sf.InsertResult
	 * @throws SFWebServiceFaultException_Exception
	 */
	@WebMethod
	@WebResult(	name = "result",
				targetNamespace = "urn:sfobject.sfapi.successfactors.com")
	@RequestWrapper(localName = "insert",
					targetNamespace = "urn:sfobject.sfapi.successfactors.com",
					className = "com.sap.coe.sf.Insert")
	@ResponseWrapper(	localName = "insertResponse",
						targetNamespace = "urn:sfobject.sfapi.successfactors.com",
						className = "com.sap.coe.sf.InsertResponse")
	public
			InsertResult
			insert(@WebParam(	name = "type",
								targetNamespace = "urn:sfobject.sfapi.successfactors.com") String type,
					@WebParam(	name = "sfobject",
								targetNamespace = "urn:sfobject.sfapi.successfactors.com") List<SFObject> sfobject,
					@WebParam(	name = "processingParam",
								targetNamespace = "urn:sfobject.sfapi.successfactors.com") List<SFParameter> processingParam)
					throws SFWebServiceFaultException_Exception;
	
	
	/**
	 * 
	 * @param processingParam
	 * @param type
	 * @param sfobject
	 * @return returns com.sap.coe.sf.UpdateResult
	 * @throws SFWebServiceFaultException_Exception
	 */
	@WebMethod
	@WebResult(	name = "result",
				targetNamespace = "urn:sfobject.sfapi.successfactors.com")
	@RequestWrapper(localName = "update",
					targetNamespace = "urn:sfobject.sfapi.successfactors.com",
					className = "com.sap.coe.sf.Update")
	@ResponseWrapper(	localName = "updateResponse",
						targetNamespace = "urn:sfobject.sfapi.successfactors.com",
						className = "com.sap.coe.sf.UpdateResponse")
	public
			UpdateResult
			update(@WebParam(	name = "type",
								targetNamespace = "urn:sfobject.sfapi.successfactors.com") String type,
					@WebParam(	name = "sfobject",
								targetNamespace = "urn:sfobject.sfapi.successfactors.com") List<SFObject> sfobject,
					@WebParam(	name = "processingParam",
								targetNamespace = "urn:sfobject.sfapi.successfactors.com") List<SFParameter> processingParam)
					throws SFWebServiceFaultException_Exception;
	
	
	/**
	 * 
	 * @param processingParam
	 * @param type
	 * @param sfobject
	 * @return returns com.sap.coe.sf.UpsertResult
	 * @throws SFWebServiceFaultException_Exception
	 */
	@WebMethod
	@WebResult(	name = "result",
				targetNamespace = "urn:sfobject.sfapi.successfactors.com")
	@RequestWrapper(localName = "upsert",
					targetNamespace = "urn:sfobject.sfapi.successfactors.com",
					className = "com.sap.coe.sf.Upsert")
	@ResponseWrapper(	localName = "upsertResponse",
						targetNamespace = "urn:sfobject.sfapi.successfactors.com",
						className = "com.sap.coe.sf.UpsertResponse")
	public
			UpsertResult
			upsert(@WebParam(	name = "type",
								targetNamespace = "urn:sfobject.sfapi.successfactors.com") String type,
					@WebParam(	name = "sfobject",
								targetNamespace = "urn:sfobject.sfapi.successfactors.com") List<SFObject> sfobject,
					@WebParam(	name = "processingParam",
								targetNamespace = "urn:sfobject.sfapi.successfactors.com") List<SFParameter> processingParam)
					throws SFWebServiceFaultException_Exception;
	
	
	/**
	 * 
	 * @param processingParam
	 * @param type
	 * @param sfobject
	 * @return returns com.sap.coe.sf.DeleteResult
	 * @throws SFWebServiceFaultException_Exception
	 */
	@WebMethod
	@WebResult(	name = "result",
				targetNamespace = "urn:sfobject.sfapi.successfactors.com")
	@RequestWrapper(localName = "delete",
					targetNamespace = "urn:sfobject.sfapi.successfactors.com",
					className = "com.sap.coe.sf.Delete")
	@ResponseWrapper(	localName = "deleteResponse",
						targetNamespace = "urn:sfobject.sfapi.successfactors.com",
						className = "com.sap.coe.sf.DeleteResponse")
	public
			DeleteResult
			delete(@WebParam(	name = "type",
								targetNamespace = "urn:sfobject.sfapi.successfactors.com") String type,
					@WebParam(	name = "sfobject",
								targetNamespace = "urn:sfobject.sfapi.successfactors.com") List<SFObject> sfobject,
					@WebParam(	name = "processingParam",
								targetNamespace = "urn:sfobject.sfapi.successfactors.com") List<SFParameter> processingParam)
					throws SFWebServiceFaultException_Exception;
	
	
	/**
	 * 
	 * @param queryString
	 * @param param
	 * @return returns com.sap.coe.sf.TaskStatus
	 * @throws SFWebServiceFaultException_Exception
	 */
	@WebMethod
	@WebResult(	name = "result",
				targetNamespace = "urn:sfobject.sfapi.successfactors.com")
	@RequestWrapper(localName = "submitQueryJob",
					targetNamespace = "urn:sfobject.sfapi.successfactors.com",
					className = "com.sap.coe.sf.SubmitQueryJob")
	@ResponseWrapper(	localName = "submitQueryJobResponse",
						targetNamespace = "urn:sfobject.sfapi.successfactors.com",
						className = "com.sap.coe.sf.SubmitQueryJobResponse")
	public
			TaskStatus
			submitQueryJob(
					@WebParam(	name = "queryString",
								targetNamespace = "urn:sfobject.sfapi.successfactors.com") String queryString,
					@WebParam(	name = "param",
								targetNamespace = "urn:sfobject.sfapi.successfactors.com") List<SFParameter> param)
					throws SFWebServiceFaultException_Exception;
	
	
	/**
	 * 
	 * @param parameters
	 * @return returns javax.activation.DataHandler
	 * @throws SFWebServiceFaultException_Exception
	 */
	@WebMethod
	@WebResult(	name = "getJobResultResponse",
				targetNamespace = "urn:sfobject.sfapi.successfactors.com",
				partName = "parameters")
	@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
	public
			DataHandler
			getJobResult(
					@WebParam(	name = "getJobResult",
								targetNamespace = "urn:sfobject.sfapi.successfactors.com",
								partName = "parameters") GetJobResult parameters)
					throws SFWebServiceFaultException_Exception;
	
	
	/**
	 * 
	 * @param parameters
	 * @return returns javax.activation.DataHandler
	 * @throws SFWebServiceFaultException_Exception
	 */
	@WebMethod
	@WebResult(	name = "getJobResultEmbeddedResponse",
				targetNamespace = "urn:sfobject.sfapi.successfactors.com",
				partName = "getJobResultEmbeddedResponse")
	@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
	public
			DataHandler
			getJobResultEmbedded(
					@WebParam(	name = "getJobResultEmbedded",
								targetNamespace = "urn:sfobject.sfapi.successfactors.com",
								partName = "parameters") GetJobResultEmbedded parameters)
					throws SFWebServiceFaultException_Exception;
	
	
	/**
	 * 
	 * @param taskId
	 * @return returns com.sap.coe.sf.TaskStatus
	 * @throws SFWebServiceFaultException_Exception
	 */
	@WebMethod
	@WebResult(	name = "result",
				targetNamespace = "urn:sfobject.sfapi.successfactors.com")
	@RequestWrapper(localName = "getJobStatus",
					targetNamespace = "urn:sfobject.sfapi.successfactors.com",
					className = "com.sap.coe.sf.GetJobStatus")
	@ResponseWrapper(	localName = "getJobStatusResponse",
						targetNamespace = "urn:sfobject.sfapi.successfactors.com",
						className = "com.sap.coe.sf.GetJobStatusResponse")
	public
			TaskStatus
			getJobStatus(
					@WebParam(	name = "taskId",
								targetNamespace = "urn:sfobject.sfapi.successfactors.com") String taskId)
					throws SFWebServiceFaultException_Exception;
	
	
	/**
	 * 
	 * @return returns java.util.List<com.sap.coe.sf.TaskStatus>
	 * @throws SFWebServiceFaultException_Exception
	 */
	@WebMethod
	@WebResult(	name = "result",
				targetNamespace = "urn:sfobject.sfapi.successfactors.com")
	@RequestWrapper(localName = "listJobs",
					targetNamespace = "urn:sfobject.sfapi.successfactors.com",
					className = "com.sap.coe.sf.ListJobs")
	@ResponseWrapper(	localName = "listJobsResponse",
						targetNamespace = "urn:sfobject.sfapi.successfactors.com",
						className = "com.sap.coe.sf.ListJobsResponse")
	public
			List<TaskStatus>
			listJobs() throws SFWebServiceFaultException_Exception;
	
	
	/**
	 * 
	 * @param taskId
	 * @return returns com.sap.coe.sf.TaskStatus
	 * @throws SFWebServiceFaultException_Exception
	 */
	@WebMethod
	@WebResult(	name = "result",
				targetNamespace = "urn:sfobject.sfapi.successfactors.com")
	@RequestWrapper(localName = "cancelJob",
					targetNamespace = "urn:sfobject.sfapi.successfactors.com",
					className = "com.sap.coe.sf.CancelJob")
	@ResponseWrapper(	localName = "cancelJobResponse",
						targetNamespace = "urn:sfobject.sfapi.successfactors.com",
						className = "com.sap.coe.sf.CancelJobResponse")
	public
			TaskStatus
			cancelJob(
					@WebParam(	name = "taskId",
								targetNamespace = "urn:sfobject.sfapi.successfactors.com") String taskId)
					throws SFWebServiceFaultException_Exception;
	
}