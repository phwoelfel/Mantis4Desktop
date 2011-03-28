package biz.futureware.mantisconnect;

public class MantisConnectPortTypeProxy implements biz.futureware.mantisconnect.MantisConnectPortType {
  private String _endpoint = null;
  private biz.futureware.mantisconnect.MantisConnectPortType mantisConnectPortType = null;
  
  public MantisConnectPortTypeProxy() {
    _initMantisConnectPortTypeProxy();
  }
  
  public MantisConnectPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initMantisConnectPortTypeProxy();
  }
  
  private void _initMantisConnectPortTypeProxy() {
    try {
      mantisConnectPortType = (new biz.futureware.mantisconnect.MantisConnectLocator()).getMantisConnectPort();
      if (mantisConnectPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mantisConnectPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mantisConnectPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mantisConnectPortType != null)
      ((javax.xml.rpc.Stub)mantisConnectPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public biz.futureware.mantisconnect.MantisConnectPortType getMantisConnectPortType() {
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType;
  }
  
  public java.lang.String mc_version() throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_version();
  }
  
  public biz.futureware.mantisconnect.ObjectRef[] mc_enum_status(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_enum_status(username, password);
  }
  
  public biz.futureware.mantisconnect.ObjectRef[] mc_enum_priorities(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_enum_priorities(username, password);
  }
  
  public biz.futureware.mantisconnect.ObjectRef[] mc_enum_severities(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_enum_severities(username, password);
  }
  
  public biz.futureware.mantisconnect.ObjectRef[] mc_enum_reproducibilities(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_enum_reproducibilities(username, password);
  }
  
  public biz.futureware.mantisconnect.ObjectRef[] mc_enum_projections(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_enum_projections(username, password);
  }
  
  public biz.futureware.mantisconnect.ObjectRef[] mc_enum_etas(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_enum_etas(username, password);
  }
  
  public biz.futureware.mantisconnect.ObjectRef[] mc_enum_resolutions(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_enum_resolutions(username, password);
  }
  
  public biz.futureware.mantisconnect.ObjectRef[] mc_enum_access_levels(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_enum_access_levels(username, password);
  }
  
  public biz.futureware.mantisconnect.ObjectRef[] mc_enum_project_status(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_enum_project_status(username, password);
  }
  
  public biz.futureware.mantisconnect.ObjectRef[] mc_enum_project_view_states(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_enum_project_view_states(username, password);
  }
  
  public biz.futureware.mantisconnect.ObjectRef[] mc_enum_view_states(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_enum_view_states(username, password);
  }
  
  public biz.futureware.mantisconnect.ObjectRef[] mc_enum_custom_field_types(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_enum_custom_field_types(username, password);
  }
  
  public java.lang.String mc_enum_get(java.lang.String username, java.lang.String password, java.lang.String enumeration) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_enum_get(username, password, enumeration);
  }
  
  public boolean mc_issue_exists(java.lang.String username, java.lang.String password, java.math.BigInteger issue_id) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_issue_exists(username, password, issue_id);
  }
  
  public biz.futureware.mantisconnect.IssueData mc_issue_get(java.lang.String username, java.lang.String password, java.math.BigInteger issue_id) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_issue_get(username, password, issue_id);
  }
  
  public java.math.BigInteger mc_issue_get_biggest_id(java.lang.String username, java.lang.String password, java.math.BigInteger project_id) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_issue_get_biggest_id(username, password, project_id);
  }
  
  public java.math.BigInteger mc_issue_get_id_from_summary(java.lang.String username, java.lang.String password, java.lang.String summary) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_issue_get_id_from_summary(username, password, summary);
  }
  
  public java.math.BigInteger mc_issue_add(java.lang.String username, java.lang.String password, biz.futureware.mantisconnect.IssueData issue) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_issue_add(username, password, issue);
  }
  
  public boolean mc_issue_update(java.lang.String username, java.lang.String password, java.math.BigInteger issueId, biz.futureware.mantisconnect.IssueData issue) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_issue_update(username, password, issueId, issue);
  }
  
  public boolean mc_issue_delete(java.lang.String username, java.lang.String password, java.math.BigInteger issue_id) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_issue_delete(username, password, issue_id);
  }
  
  public java.math.BigInteger mc_issue_note_add(java.lang.String username, java.lang.String password, java.math.BigInteger issue_id, biz.futureware.mantisconnect.IssueNoteData note) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_issue_note_add(username, password, issue_id, note);
  }
  
  public boolean mc_issue_note_delete(java.lang.String username, java.lang.String password, java.math.BigInteger issue_note_id) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_issue_note_delete(username, password, issue_note_id);
  }
  
  public java.math.BigInteger mc_issue_relationship_add(java.lang.String username, java.lang.String password, java.math.BigInteger issue_id, biz.futureware.mantisconnect.RelationshipData relationship) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_issue_relationship_add(username, password, issue_id, relationship);
  }
  
  public boolean mc_issue_relationship_delete(java.lang.String username, java.lang.String password, java.math.BigInteger issue_id, java.math.BigInteger relationship_id) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_issue_relationship_delete(username, password, issue_id, relationship_id);
  }
  
  public java.math.BigInteger mc_issue_attachment_add(java.lang.String username, java.lang.String password, java.math.BigInteger issue_id, java.lang.String name, java.lang.String file_type, byte[] content) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_issue_attachment_add(username, password, issue_id, name, file_type, content);
  }
  
  public boolean mc_issue_attachment_delete(java.lang.String username, java.lang.String password, java.math.BigInteger issue_attachment_id) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_issue_attachment_delete(username, password, issue_attachment_id);
  }
  
  public byte[] mc_issue_attachment_get(java.lang.String username, java.lang.String password, java.math.BigInteger issue_attachment_id) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_issue_attachment_get(username, password, issue_attachment_id);
  }
  
  public java.math.BigInteger mc_project_add(java.lang.String username, java.lang.String password, biz.futureware.mantisconnect.ProjectData project) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_project_add(username, password, project);
  }
  
  public boolean mc_project_delete(java.lang.String username, java.lang.String password, java.math.BigInteger project_id) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_project_delete(username, password, project_id);
  }
  
  public boolean mc_project_update(java.lang.String username, java.lang.String password, java.math.BigInteger project_id, biz.futureware.mantisconnect.ProjectData project) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_project_update(username, password, project_id, project);
  }
  
  public biz.futureware.mantisconnect.IssueData[] mc_project_get_issues(java.lang.String username, java.lang.String password, java.math.BigInteger project_id, java.math.BigInteger page_number, java.math.BigInteger per_page) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_project_get_issues(username, password, project_id, page_number, per_page);
  }
  
  public biz.futureware.mantisconnect.IssueHeaderData[] mc_project_get_issue_headers(java.lang.String username, java.lang.String password, java.math.BigInteger project_id, java.math.BigInteger page_number, java.math.BigInteger per_page) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_project_get_issue_headers(username, password, project_id, page_number, per_page);
  }
  
  public biz.futureware.mantisconnect.AccountData[] mc_project_get_users(java.lang.String username, java.lang.String password, java.math.BigInteger project_id, java.math.BigInteger access) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_project_get_users(username, password, project_id, access);
  }
  
  public biz.futureware.mantisconnect.ProjectData[] mc_projects_get_user_accessible(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_projects_get_user_accessible(username, password);
  }
  
  public java.lang.String[] mc_project_get_categories(java.lang.String username, java.lang.String password, java.math.BigInteger project_id) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_project_get_categories(username, password, project_id);
  }
  
  public java.math.BigInteger mc_project_add_category(java.lang.String username, java.lang.String password, java.math.BigInteger project_id, java.lang.String p_category_name) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_project_add_category(username, password, project_id, p_category_name);
  }
  
  public java.math.BigInteger mc_project_delete_category(java.lang.String username, java.lang.String password, java.math.BigInteger project_id, java.lang.String p_category_name) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_project_delete_category(username, password, project_id, p_category_name);
  }
  
  public java.math.BigInteger mc_project_rename_category_by_name(java.lang.String username, java.lang.String password, java.math.BigInteger project_id, java.lang.String p_category_name, java.lang.String p_category_name_new, java.math.BigInteger p_assigned_to) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_project_rename_category_by_name(username, password, project_id, p_category_name, p_category_name_new, p_assigned_to);
  }
  
  public biz.futureware.mantisconnect.ProjectVersionData[] mc_project_get_versions(java.lang.String username, java.lang.String password, java.math.BigInteger project_id) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_project_get_versions(username, password, project_id);
  }
  
  public java.math.BigInteger mc_project_version_add(java.lang.String username, java.lang.String password, biz.futureware.mantisconnect.ProjectVersionData version) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_project_version_add(username, password, version);
  }
  
  public boolean mc_project_version_update(java.lang.String username, java.lang.String password, java.math.BigInteger version_id, biz.futureware.mantisconnect.ProjectVersionData version) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_project_version_update(username, password, version_id, version);
  }
  
  public boolean mc_project_version_delete(java.lang.String username, java.lang.String password, java.math.BigInteger version_id) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_project_version_delete(username, password, version_id);
  }
  
  public biz.futureware.mantisconnect.ProjectVersionData[] mc_project_get_released_versions(java.lang.String username, java.lang.String password, java.math.BigInteger project_id) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_project_get_released_versions(username, password, project_id);
  }
  
  public biz.futureware.mantisconnect.ProjectVersionData[] mc_project_get_unreleased_versions(java.lang.String username, java.lang.String password, java.math.BigInteger project_id) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_project_get_unreleased_versions(username, password, project_id);
  }
  
  public biz.futureware.mantisconnect.ProjectAttachmentData[] mc_project_get_attachments(java.lang.String username, java.lang.String password, java.math.BigInteger project_id) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_project_get_attachments(username, password, project_id);
  }
  
  public biz.futureware.mantisconnect.CustomFieldDefinitionData[] mc_project_get_custom_fields(java.lang.String username, java.lang.String password, java.math.BigInteger project_id) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_project_get_custom_fields(username, password, project_id);
  }
  
  public byte[] mc_project_attachment_get(java.lang.String username, java.lang.String password, java.math.BigInteger project_attachment_id) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_project_attachment_get(username, password, project_attachment_id);
  }
  
  public java.math.BigInteger mc_project_attachment_add(java.lang.String username, java.lang.String password, java.math.BigInteger project_id, java.lang.String name, java.lang.String title, java.lang.String description, java.lang.String file_type, byte[] content) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_project_attachment_add(username, password, project_id, name, title, description, file_type, content);
  }
  
  public boolean mc_project_attachment_delete(java.lang.String username, java.lang.String password, java.math.BigInteger project_attachment_id) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_project_attachment_delete(username, password, project_attachment_id);
  }
  
  public biz.futureware.mantisconnect.FilterData[] mc_filter_get(java.lang.String username, java.lang.String password, java.math.BigInteger project_id) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_filter_get(username, password, project_id);
  }
  
  public biz.futureware.mantisconnect.IssueData[] mc_filter_get_issues(java.lang.String username, java.lang.String password, java.math.BigInteger project_id, java.math.BigInteger filter_id, java.math.BigInteger page_number, java.math.BigInteger per_page) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_filter_get_issues(username, password, project_id, filter_id, page_number, per_page);
  }
  
  public biz.futureware.mantisconnect.IssueHeaderData[] mc_filter_get_issue_headers(java.lang.String username, java.lang.String password, java.math.BigInteger project_id, java.math.BigInteger filter_id, java.math.BigInteger page_number, java.math.BigInteger per_page) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_filter_get_issue_headers(username, password, project_id, filter_id, page_number, per_page);
  }
  
  public java.lang.String mc_config_get_string(java.lang.String username, java.lang.String password, java.lang.String config_var) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_config_get_string(username, password, config_var);
  }
  
  public boolean mc_issue_checkin(java.lang.String username, java.lang.String password, java.math.BigInteger issue_id, java.lang.String comment, boolean fixed) throws java.rmi.RemoteException{
    if (mantisConnectPortType == null)
      _initMantisConnectPortTypeProxy();
    return mantisConnectPortType.mc_issue_checkin(username, password, issue_id, comment, fixed);
  }
  
  
}