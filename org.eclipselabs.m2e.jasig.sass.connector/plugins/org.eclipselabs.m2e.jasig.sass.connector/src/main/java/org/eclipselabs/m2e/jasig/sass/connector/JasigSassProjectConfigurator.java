package org.eclipselabs.m2e.jasig.sass.connector;

import org.apache.maven.plugin.MojoExecution;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.m2e.core.lifecyclemapping.model.IPluginExecutionMetadata;
import org.eclipse.m2e.core.project.IMavenProjectFacade;
import org.eclipse.m2e.core.project.configurator.AbstractBuildParticipant;
import org.eclipse.m2e.core.project.configurator.AbstractProjectConfigurator;
import org.eclipse.m2e.core.project.configurator.ProjectConfigurationRequest;

public class JasigSassProjectConfigurator extends AbstractProjectConfigurator
{
	public JasigSassProjectConfigurator()
	{
	}

	@Override
	public AbstractBuildParticipant getBuildParticipant( IMavenProjectFacade projectFacade, MojoExecution execution,
			IPluginExecutionMetadata executionMetadata )
	{
		return new JasigSassBuildParticipant( execution );
	}

	@Override
	public void configure( ProjectConfigurationRequest request, IProgressMonitor monitor ) throws CoreException
	{
		// TODO Auto-generated method stub
	}
}
