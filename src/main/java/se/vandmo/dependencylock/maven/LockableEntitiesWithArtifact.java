package se.vandmo.dependencylock.maven;

import java.util.Collection;
import java.util.stream.Stream;

public class LockableEntitiesWithArtifact<Type extends LockableEntityWithArtifact<Type>>
    extends LockableEntities<Type> {

  LockableEntitiesWithArtifact(Collection<Type> contents, boolean sort) {
    super(contents, sort);
  }

  public Stream<Artifact> artifacts() {
    return stream().map(entity -> entity.artifact);
  }
}
