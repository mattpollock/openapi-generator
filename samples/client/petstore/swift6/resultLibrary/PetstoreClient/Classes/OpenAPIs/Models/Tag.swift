//
// Tag.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

internal struct Tag: Sendable, Codable, ParameterConvertible, Hashable {

    internal private(set) var id: Int64?
    internal private(set) var name: String?

    internal init(id: Int64? = nil, name: String? = nil) {
        self.id = id
        self.name = name
    }

    internal enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case name
    }

    // Encodable protocol methods

    internal func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(id, forKey: .id)
        try container.encodeIfPresent(name, forKey: .name)
    }
}


@available(iOS 13, tvOS 13, watchOS 6, macOS 10.15, *)
extension Tag: Identifiable {}
