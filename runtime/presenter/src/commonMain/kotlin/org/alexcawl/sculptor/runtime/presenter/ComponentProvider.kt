package org.alexcawl.sculptor.runtime.presenter

import org.alexcawl.sculptor.core.contract.Identifier
import org.alexcawl.sculptor.core.contract.Section.Block

/**
 * Interface for providing components, specifically for finding blocks by their identifier.
 */
public fun interface ComponentProvider {
    /**
     * Asynchronously finds a block by its identifier.
     *
     * @param identifier The unique identifier of the block to find.
     * @return The [Block] corresponding to the given identifier.
     * @throws IllegalStateException if the block with the specified identifier is not found or an error occurs.
     */
    @Throws(IllegalStateException::class)
    public suspend fun findBlock(identifier: Identifier): Block
}
