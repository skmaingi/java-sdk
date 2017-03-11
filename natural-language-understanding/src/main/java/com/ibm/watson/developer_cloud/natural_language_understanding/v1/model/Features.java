/*
 * Copyright 2017 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.natural_language_understanding.v1.model;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * Analysis features and options.
 */
public class Features extends GenericModel {

  /** Whether or not to return the concepts that are mentioned in the analyzed text. */
  private ConceptsOptions concepts;
  /** Whether or not to extract the emotions implied in the analyzed text. */
  private EmotionOptions emotion;
  /** Whether or not to extract detected entity objects from the analyzed text. */
  private EntitiesOptions entities;
  /** Whether or not to return the keywords in the analyzed text. */
  private KeywordsOptions keywords;
  /** Whether or not the author, publication date, and title of the analyzed text should be returned. This parameter is only available for URL and HTML input. */
  private Map<String, Object> metadata;
  /** Whether or not to return the relationships between detected entities in the analyzed text. */
  private RelationsOptions relations;
  /** Whether or not to return the subject-action-object relations from the analyzed text. */
  @SerializedName("semantic_roles")
  private SemanticRolesOptions semanticRoles;
  /** Whether or not to return the overall sentiment of the analyzed text. */
  private SentimentOptions sentiment;
  /** Whether or not to return the high level category the content is categorized as (i.e. news, art). */
  private Map<String, Object> categories;

  /**
   * Builder.
   */
  public static class Builder {
    private ConceptsOptions concepts;
    private EmotionOptions emotion;
    private EntitiesOptions entities;
    private KeywordsOptions keywords;
    private Map<String, Object> metadata;
    private RelationsOptions relations;
    private SemanticRolesOptions semanticRoles;
    private SentimentOptions sentiment;
    private Map<String, Object> categories;

    private Builder(Features features) {
      concepts = features.concepts;
      emotion = features.emotion;
      entities = features.entities;
      keywords = features.keywords;
      metadata = features.metadata;
      relations = features.relations;
      semanticRoles = features.semanticRoles;
      sentiment = features.sentiment;
      categories = features.categories;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() { }

    /**
     * Builds the Features.
     *
     * @return the features
     */
    public Features build() {
      return new Features(this);
    }

    /**
     * Add the concepts.
     *
     * @param concepts the concepts
     * @return a Features Builder
     */
    public Builder concepts(ConceptsOptions concepts) {
      this.concepts = concepts;
      return this;
    }

    /**
     * Add the emotion.
     *
     * @param emotion the emotion
     * @return a Features Builder
     */
    public Builder emotion(EmotionOptions emotion) {
      this.emotion = emotion;
      return this;
    }

    /**
     * Add the entities.
     *
     * @param entities the entities
     * @return a Features Builder
     */
    public Builder entities(EntitiesOptions entities) {
      this.entities = entities;
      return this;
    }

    /**
     * Add the keywords.
     *
     * @param keywords the keywords
     * @return a Features Builder
     */
    public Builder keywords(KeywordsOptions keywords) {
      this.keywords = keywords;
      return this;
    }

    /**
     * Add the metadata.
     *
     * @param metadata the metadata
     * @return a Features Builder
     */
    public Builder metadata(Map<String, Object> metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * Add the relations.
     *
     * @param relations the relations
     * @return a Features Builder
     */
    public Builder relations(RelationsOptions relations) {
      this.relations = relations;
      return this;
    }

    /**
     * Add the semanticRoles.
     *
     * @param semanticRoles the semanticRoles
     * @return a Features Builder
     */
    public Builder semanticRoles(SemanticRolesOptions semanticRoles) {
      this.semanticRoles = semanticRoles;
      return this;
    }

    /**
     * Add the sentiment.
     *
     * @param sentiment the sentiment
     * @return a Features Builder
     */
    public Builder sentiment(SentimentOptions sentiment) {
      this.sentiment = sentiment;
      return this;
    }

    /**
     * Add the categories.
     *
     * @param categories the categories
     * @return a Features Builder
     */
    public Builder categories(Map<String, Object> categories) {
      this.categories = categories;
      return this;
    }
  }

  private Features(Builder builder) {
    concepts = builder.concepts;
    emotion = builder.emotion;
    entities = builder.entities;
    keywords = builder.keywords;
    metadata = builder.metadata;
    relations = builder.relations;
    semanticRoles = builder.semanticRoles;
    sentiment = builder.sentiment;
    categories = builder.categories;
  }

  /**
   * Gets the concepts.
   *
   * @return the concepts
   */
  public ConceptsOptions getConcepts() {
    return concepts;
  }

  /**
   * Gets the emotion.
   *
   * @return the emotion
   */
  public EmotionOptions getEmotion() {
    return emotion;
  }

  /**
   * Gets the entities.
   *
   * @return the entities
   */
  public EntitiesOptions getEntities() {
    return entities;
  }

  /**
   * Gets the keywords.
   *
   * @return the keywords
   */
  public KeywordsOptions getKeywords() {
    return keywords;
  }

  /**
   * Gets the metadata.
   *
   * @return the metadata
   */
  public Map<String, Object> getMetadata() {
    return metadata;
  }

  /**
   * Gets the relations.
   *
   * @return the relations
   */
  public RelationsOptions getRelations() {
    return relations;
  }

  /**
   * Gets the semanticRoles.
   *
   * @return the semanticRoles
   */
  public SemanticRolesOptions getSemanticRoles() {
    return semanticRoles;
  }

  /**
   * Gets the sentiment.
   *
   * @return the sentiment
   */
  public SentimentOptions getSentiment() {
    return sentiment;
  }

  /**
   * Gets the categories.
   *
   * @return the categories
   */
  public Map<String, Object> getCategories() {
    return categories;
  }

  /**
   * Sets the concepts.
   *
   * @param concepts the new concepts
   */
  public void setConcepts(final ConceptsOptions concepts) {
    this.concepts = concepts;
  }

  /**
   * Sets the emotion.
   *
   * @param emotion the new emotion
   */
  public void setEmotion(final EmotionOptions emotion) {
    this.emotion = emotion;
  }

  /**
   * Sets the entities.
   *
   * @param entities the new entities
   */
  public void setEntities(final EntitiesOptions entities) {
    this.entities = entities;
  }

  /**
   * Sets the keywords.
   *
   * @param keywords the new keywords
   */
  public void setKeywords(final KeywordsOptions keywords) {
    this.keywords = keywords;
  }

  /**
   * Sets the metadata.
   *
   * @param metadata the new metadata
   */
  public void setMetadata(final Map<String, Object> metadata) {
    this.metadata = metadata;
  }

  /**
   * Sets the relations.
   *
   * @param relations the new relations
   */
  public void setRelations(final RelationsOptions relations) {
    this.relations = relations;
  }

  /**
   * Sets the semanticRoles.
   *
   * @param semanticRoles the new semanticRoles
   */
  public void setSemanticRoles(final SemanticRolesOptions semanticRoles) {
    this.semanticRoles = semanticRoles;
  }

  /**
   * Sets the sentiment.
   *
   * @param sentiment the new sentiment
   */
  public void setSentiment(final SentimentOptions sentiment) {
    this.sentiment = sentiment;
  }

  /**
   * Sets the categories.
   *
   * @param categories the new categories
   */
  public void setCategories(final Map<String, Object> categories) {
    this.categories = categories;
  }

}
