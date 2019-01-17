
package repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.Folder;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Integer> {

	@Query("select f from Folder f where f.actor.id = ?1")
	List<Folder> getFoldersByActor(Integer actorId);

	@Query("select f from Folder f where f.actor.id = ?1 and f.name = ?2")
	Folder getFolderByActorAndName(Integer actorId, String name);

	@Query("select m.folder from Message m where m.folder.actor.id = ?1 and m.id = ?2")
	Folder getFolderByActorAndMessage(int actorId, int messageId);

	@Query("select f from Folder f where f.parentFolder.id = ?1")
	Collection<Folder> getByParentId(int parentId);

	@Query("select f from Folder f where f.actor.id = ?1 and f.parentFolder.id = ?2 and not f.id = f.parentFolder.id")
	Collection<Folder> findByActorIdAndParentId(int actorId, int folderId);

	@Query("select f from Folder f where f.actor.id = ?1 and f.parentFolder.id = f.id")
	Collection<Folder> findByActorIdWithoutParent(int actorId);

}
